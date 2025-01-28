package com.example.controller;

import com.example.config.ServiceConfiguration;
import com.example.config.WelcomeConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    private final ServiceConfiguration configuration;
    private final WelcomeConfiguration welcomeConfig;

    public ConfigController(ServiceConfiguration configuration, WelcomeConfiguration welcomeConfig) {
        this.configuration = configuration;
        this.welcomeConfig = welcomeConfig;
    }

    @GetMapping("/values")
    public String getConfigs() {
        return configuration.toString();
    }

    @GetMapping("/welcome")
    public String welcome() {
        return welcomeConfig.getMessage();
    }
}
