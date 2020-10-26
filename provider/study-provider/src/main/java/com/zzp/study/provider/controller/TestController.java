package com.zzp.study.provider.controller;

import com.zzp.study.provider.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.ws.rs.GET;

/**
 *
 * <p>
 *  //TODO
 *  TestController.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/10/26 23:55
 * @see  com.zzp.study.provider.controller
 **/
@RestController
@RequestMapping(value = "provider")
public class TestController {
    @Resource
    private TestService testService;

    @GetMapping(value = "/msg")
    public String msg(){
        return testService.printMsg();
    }
}
