package com.zzp.study.business.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * <p>
 *  //TODO
 *  TestFeign.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/10/27 0:03
 * @see  com.zzp.study.business.feign
 **/
@FeignClient("STUDY-PROVIDER")
public interface TestFeign {
    /**
     * msg
     * @return .
     */
    @GetMapping(value = "/provider/msg")
    String msg();
}
