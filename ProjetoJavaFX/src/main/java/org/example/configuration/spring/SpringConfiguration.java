package org.example.configuration.spring;

import org.example.controllers.LoginWindowController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {
    @Bean
    public LoginWindowController loginWindowController() {
        return new LoginWindowController();
    }
}
