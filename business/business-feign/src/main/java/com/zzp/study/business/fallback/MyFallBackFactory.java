package com.zzp.study.business.fallback;

import com.zzp.study.business.feign.StudentSignFeign;
import com.zzp.study.common.dto.SignDto;
import com.zzp.study.common.vo.ResultVo;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
/**
 *
 * <p>
 *  //TODO
 *  MyFallBackFactory.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/10/29 9:04
 * @see  com.zzp.study.business.fallback
 **/
@Component
public class MyFallBackFactory implements FallbackFactory<StudentSignFeign> {
    @Override
    public StudentSignFeign create(Throwable throwable) {
        return new StudentSignFeign(){
            @Override
            public ResultVo save(SignDto dto) {
                return ResultVo.fail("服务不可用-save");
            }

            @Override
            public ResultVo names(String name) {
                return ResultVo.fail("服务不可用-names:"+name);
            }

            @Override
            public ResultVo all() {
                return ResultVo.fail("服务不可用-all");
            }
        };
    }
}
