package com.zzp.study.business.controller.fallback;

import com.zzp.study.common.vo.ResultVo;
import lombok.extern.slf4j.Slf4j;

/**
 *
 * <p>
 *  //TODO
 *  StuSignRollback.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/11/3 0:13
 * @see  com.zzp.study.business.controller.fallback
 **/
@Slf4j
public class StuSignFallback {
    /**
     * 前端异常回滚
     * @return .
     */
    public static ResultVo signFallback(){
        log.error("签名服务出现异常！");
        return ResultVo.fail("前端服务器异常！");
    }

}
