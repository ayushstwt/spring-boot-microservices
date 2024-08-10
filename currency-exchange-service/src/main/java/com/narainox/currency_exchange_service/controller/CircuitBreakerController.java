package com.narainox.currency_exchange_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBreakerController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
