package com.narainox.currency_exchange_service.controller;

import com.narainox.currency_exchange_service.entity.CurrencyExchange;
import com.narainox.currency_exchange_service.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Currency;

@RestController
@RequestMapping("/api/currency-exchange")
public class CurrencyController {

    @Autowired
    private CurrencyService currencyService;

    @Autowired
    private Environment environment;

    @GetMapping("/from/{from}/to/{to}")
    public CurrencyExchange getExchangeValue(@PathVariable String from, @PathVariable String to) {
        CurrencyExchange exchangeValue = currencyService.getExchangeValue(from, to);
        exchangeValue.setEnvironment(environment.getProperty("local.server.port"));
        return exchangeValue;
    }
}
