package com.zzp.study.provider.service;

import com.zzp.study.common.dto.SignDto;
import com.zzp.study.common.vo.ResultVo;
import com.zzp.study.provider.domain.StuSign;
import com.zzp.study.provider.mapper.StuSignMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.BeanUtils;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.Date;
/**
 *
 * <p>
 *  //TODO
 *  StudentSignServiceImpl.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/11/1 22:45
 * @see  com.zzp.study.provider.service
 **/
@DubboService(version = "0.0.1", delay = -1, timeout = 6000, retries = 5)
public class StudentSignServiceImpl implements StudentSignService {
    @Resource
    private StuSignMapper stuSignMapper;

    @Override
    public ResultVo sign(SignDto dto) {
        var stuSign = new StuSign();
        BeanUtils.copyProperties(dto,stuSign);
        stuSign.setType("上课签到");
        stuSign.setSTime(new Date());
        if (stuSignMapper.insert(stuSign)>0){
            return ResultVo.ok();
        }else {
            return ResultVo.fail();
        }
    }

    @Override
    public ResultVo queryByName(String name) {
        var e = new Example(StuSign.class);
        e.createCriteria().andEqualTo("name",name);
        var stuSigns = stuSignMapper.selectByExample(e);
        if (!stuSigns.isEmpty()){
            return ResultVo.ok(stuSigns);
        }else {
            return ResultVo.fail("暂无签到数据");
        }
    }

    @Override
    public ResultVo queryAll() {
        return ResultVo.ok(stuSignMapper.selectAll());
    }
}

