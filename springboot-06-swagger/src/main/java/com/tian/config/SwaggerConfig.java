package com.tian.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    //配置swagger的docket的bean实例
    //docket实例上关联apiInfo
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                // RequestHandlerSelectors：配置扫描接口的方式
                // basePackage：指定要扫描的包
                // any：全部
                // none：不扫描
                .apis(RequestHandlerSelectors.basePackage("com.tian.controller"))
                // 过滤
                //.paths(PathSelectors.ant("/tian/**"))
                .build();
    }

    //配置swagger信息-->apiInfo
    private ApiInfo apiInfo() {
        Contact contact = new Contact("秦将", "http://blog.kuangstudy.com/", "123456789@qq.com");
        return new ApiInfo(
                "Swagger学习", // 标题
                "学习演示如何配置Swagger", // 描述
                "v1.0", // 版本
                "http://terms.service.url/组织链接", // 组织链接
                contact, // 联系人信息
                "Apach 2.0 许可", // 许可
                "许可链接", // 许可连接
                new ArrayList<>()// 扩展
        );
    }


}
