package com.zzp.study.business.feign;

import com.zzp.study.business.fallback.MyFallBackFactory;
import com.zzp.study.common.dto.SignDto;
import com.zzp.study.common.vo.ResultVo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
/**
 *
 * <p>
 *  //TODO
 *  StudentSignFeign.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/10/29 9:04
 * @see  com.zzp.study.business.feign
 **/
@FeignClient(value = "provider-sign-service", fallbackFactory = MyFallBackFactory.class)
public interface StudentSignFeign {
    /**
     * 签到
     *
     * @param dto .
     * @return .
     */
    @PostMapping("/provider/sign/save.do")
    ResultVo save(@RequestBody SignDto dto);

    /**
     * 根据名字查询
     *
     * @param name .
     * @return .
     */
    @GetMapping("/provider/sign/queryname.do")
    ResultVo names(@RequestParam String name);

    /**
     * 查询全部
     *
     * @return .
     */
    @GetMapping("/provider/sign/all.do")
    ResultVo all();
}
