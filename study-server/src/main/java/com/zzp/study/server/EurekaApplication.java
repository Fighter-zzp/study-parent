package com.zzp.study.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 注册中心
 * <p>
 *  //TODO
 *  EurekaApplication.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/10/26 23:29
 * @see  com.zzp.study.server
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
