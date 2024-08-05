package com.narainox.currency_conversion_service.controller;

import com.narainox.currency_conversion_service.entity.CurrencyConversion;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@RestController
@RequestMapping("/api/currency-conversion")
public class CurrencyConversionController {

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion convertCurrency(
            @PathVariable String from,
            @PathVariable String to,
            @PathVariable double quantity)
    {

        HashMap<String,String> uriVariables = new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);
        ResponseEntity<CurrencyConversion> responseEntity = new RestTemplate().getForEntity("http://localhost:8000/api/currency-exchange/from/{from}/to/{to}", CurrencyConversion.class, uriVariables);
        CurrencyConversion responseEntityBody = responseEntity.getBody();
        CurrencyConversion currencyConversion = new CurrencyConversion();
        currencyConversion.setId(responseEntityBody.getId());
        currencyConversion.setFrom(from);
        currencyConversion.setTo(to);
        currencyConversion.setQuantity(quantity);
        currencyConversion.setConversionMultiple(responseEntityBody.getConversionMultiple());
        currencyConversion.setTotalCalculatedAmount(quantity * responseEntityBody.getConversionMultiple());
        currencyConversion.setEnvironment(responseEntityBody.getEnvironment());
        return currencyConversion;
    }
}

