package com.probestack.forgestudio.design.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.probestack.forgestudio.design.config.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Content Management API")
                                .description("Microservice for storing and retrieving business documents such as contracts and receipts. Supports metadata search, versioning, and signed download links. ")
                                .contact(
                                        new Contact()
                                                .name("Content Platform Team")
                                                .email("documents@example.com")
                                )
                                .version("1.0.0")
                )
        ;
    }
}
