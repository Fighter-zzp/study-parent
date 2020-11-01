package com.zzp.study.provider.service;

import com.zzp.study.common.dto.SignDto;
import com.zzp.study.common.vo.ResultVo;
/**
 *
 * <p>
 *  //TODO
 *  StuSignService.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/11/1 22:43
 * @see  com.zzp.study.provider.service
 **/
public interface StudentSignService {
    /**
     * 签到
     * @param dto .
     * @return .
     */
    ResultVo sign(SignDto dto);

    /**
     * 根据名字查询
     * @param name .
     * @return .
     */
    ResultVo queryByName(String name);

    /**
     * 查询全部
     * @return .
     */
    ResultVo queryAll();
}