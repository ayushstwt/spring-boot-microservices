package com.narainox.limits_service.controller;

import com.narainox.limits_service.config.ApplicationConfig;
import com.narainox.limits_service.entity.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitController {

    @Autowired
    ApplicationConfig config;

    @GetMapping("/limits")
    public Limits getLimits() {
        return new Limits(config.getMaximum(), config.getMinimum());
    }

//    @GetMapping("/limitsConfig")
//    public Limits getLimitsConfig() {
//        return new Limits(config.getMaximum(), config.getMinimum());
//    }
}
