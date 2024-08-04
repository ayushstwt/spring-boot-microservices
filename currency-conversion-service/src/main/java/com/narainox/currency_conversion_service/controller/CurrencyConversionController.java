package com.narainox.currency_conversion_service.controller;

import com.narainox.currency_conversion_service.entity.CurrencyConversion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/currency-conversion")
public class CurrencyConversionController {

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion convertCurrency(
            @PathVariable String from,
            @PathVariable String to,
            @PathVariable double quantity) {
        return new CurrencyConversion();
    }
}
