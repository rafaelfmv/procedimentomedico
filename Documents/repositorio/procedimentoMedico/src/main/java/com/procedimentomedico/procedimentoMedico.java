package com.procedimentomedico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableJpaRepositories({"com.procedimentomedico.repository"})
@EnableConfigurationProperties(value = {LiquibaseProperties.class})
@EntityScan({"com.procedimentomedico.model"})
public class procedimentoMedico implements WebMvcConfigurer {
    public static void main(String[] args) {
        SpringApplication.run(procedimentoMedico.class, args);
    }
}
