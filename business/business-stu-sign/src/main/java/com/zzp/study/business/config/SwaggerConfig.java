package com.zzp.study.business.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
/**
 *
 * <p>
 *  //TODO
 *  SwaggerConfig.java
 * </p>
 * @version v0.0.1
 * @author 佐斯特勒
 * @date 2020/11/1 23:43
 * @see  com.zzp.study.business.config
 **/
@Configuration
@EnableSwagger2
@EnableKnife4j
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig implements WebMvcConfigurer {

    public ApiInfo createAi() {
        return new ApiInfoBuilder().title("签到小程序接口").
                description("测试gradle构建的SpringCloudAlibaba项目").
                contact(new Contact("zzp", "http://www.baidu.com", "zzpJsuter@163.com")).build();
    }

    @Bean
    public Docket createD() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createAi()).select().
                apis(RequestHandlerSelectors.basePackage("com.zzp.study.business.controller")).build();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("doc.html").addResourceLocations("classpath:/META-INF/resources/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
