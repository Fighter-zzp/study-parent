package com.zzp.study.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 *
 * <p>
 *  //TODO
 *  StudyProviderApplication.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/10/26 23:46
 * @see  com.zzp.study.provider
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class StudyProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudyProviderApplication.class, args);
    }
}