package com.zzp.study.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;
/**
 *
 * <p>
 *  //TODO
 *  SignStudyApplication.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/11/1 22:34
 * @see  com.zzp.study.provider
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.zzp.study.provider.mapper")
public class SignStudyProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SignStudyProviderApplication.class, args);
    }
}
