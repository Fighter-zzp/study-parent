package com.zzp.study.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
/**
 *
 * <p>
 *  //TODO
 *  StudyBusinessApplication.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/10/27 0:07
 * @see  com.zzp.study.business
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class StudyBusinessApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudyBusinessApplication.class, args);
    }
}
