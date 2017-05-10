package com.springboot;

import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2 Restful 接口文档及测试
 * Created by user on 2017/5/10.
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.springboot.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
        //return new ApiInfo("Spring boot 学习项目","接口文档","1.0","termsOfServiceUrl",new Contact("oldfeel", "", "tbs005@qq.com"),"license", "licenseUrl");
        return new ApiInfoBuilder().title("Spring boot 学习项目")
                .description("接口文档")
                .version("1.0")
                .license("")
                .licenseUrl("")
                .build();
    }
}
