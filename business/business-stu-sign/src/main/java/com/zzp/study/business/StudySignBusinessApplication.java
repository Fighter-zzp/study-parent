package com.zzp.study.business;

import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 *
 * <p>
 *  //TODO
 *  StudySignBusinessApplication.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/11/1 23:05
 * @see  com.zzp.study.business
 **/
@SpringBootApplication
@EnableDiscoveryClient
@DubboComponentScan(basePackages = "com.zzp.study.business.controller")
public class StudySignBusinessApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudySignBusinessApplication.class, args);
    }
}
