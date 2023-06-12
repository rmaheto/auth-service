package com.coemaniac.authservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertiesConfig {

    @Bean
    public PropertiesLoader propertiesLoader() {
        return new PropertiesLoader();
    }
}
