package com.example.tecnologia;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TecnologiaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TecnologiaApplication.class, args);
    }
    @Bean
    public OpenAPI custoOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("OPEN API MICROSERVICIOS TECNOLOGIA")
                .version("0.0.1")
                .description("servicio web tecnologia")
                .termsOfService("http://swagger.io/terms")
                .license(new License().name("Apache 2.0").url("http://springdoc.org"))
        );
    }
}
