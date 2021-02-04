package com.procedimentomedico.config.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "security")
public class SecurityApplicationProperties {

    private String jwtKey;
    private String googleCredentialsPath;
}
