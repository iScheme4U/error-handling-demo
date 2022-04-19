package com.soulcraft.demo.errorhandling.demo3.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger配置文件
 *
 * @author SoulCraft
 * @since 2022-03-28
 */
@Configuration
public class Swagger3Config {
    @Bean
    public OpenAPI helloOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Hello API")
                        .description("Spring hello sample application")
                        .version("v0.0.1")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }
}