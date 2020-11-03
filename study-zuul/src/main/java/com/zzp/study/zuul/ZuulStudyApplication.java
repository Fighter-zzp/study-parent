package com.zzp.study.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 *
 * <p>
 *  //TODO
 *  ZuulStudyApplication.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/11/3 19:16
 * @see  com.zzp.study.zuul
 **/
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@EnableEurekaClient
public class ZuulStudyApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulStudyApplication.class, args);
    }
}
