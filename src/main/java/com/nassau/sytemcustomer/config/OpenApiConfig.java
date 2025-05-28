package com.nassau.sytemcustomer.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("HelpDesk API - Uninassau")
                        .version("1.0")
                        .description("API para sistema de Ordem de Serviço - Projeto para professora Vanessa - Backend Frameworks"));
    }
}