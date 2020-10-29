package com.zzp.study.business.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>
 * // http://${host}:${port}/doc.html
 * SwaggerConfig.java
 * </p>
 *
 * @author 佐斯特勒
 * @version v0.0.1
 * @date 2020/10/29 9:15
 * @see com.zzp.study.business.config
 **/
@Configuration
@EnableSwagger2
@EnableKnife4j
public class SwaggerConfig {

    public ApiInfo createAi() {
        return new ApiInfoBuilder().title("签到小程序接口").
                description("测试gradle构建的SpringCloud项目和feign的熔断").
                contact(new Contact("zzp", "http://www.baidu.com", "zzptest@163.com")).build();
    }

    @Bean
    public Docket createD() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createAi()).select().
                apis(RequestHandlerSelectors.basePackage("com.zzp.study.business.controller")).build();
    }
}

