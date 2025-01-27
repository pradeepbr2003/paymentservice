package com.example.controller;

import com.example.config.ServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {
    @Autowired
    private final ServiceConfiguration configuration;

    public ConfigController(ServiceConfiguration configuration) {
        this.configuration = configuration;
    }

    @GetMapping("/values")
    public String getConfigs() {
       return configuration.toString();
    }
}
