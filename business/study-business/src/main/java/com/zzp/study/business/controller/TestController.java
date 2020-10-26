package com.zzp.study.business.controller;

import com.zzp.study.business.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 * <p>
 *  //TODO
 *  TestController.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/10/27 0:06
 * @see  com.zzp.study.business.controller
 **/
@RestController
@RequestMapping(value = "business")
public class TestController {

    @Resource
    private TestFeign testFeign;

    @GetMapping("/hello")
    public String hello(){
        return testFeign.msg();

    }
}
