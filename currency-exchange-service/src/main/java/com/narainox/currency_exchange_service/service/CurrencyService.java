package com.narainox.currency_exchange_service.service;

import com.narainox.currency_exchange_service.entity.CurrencyExchange;
import com.narainox.currency_exchange_service.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    @Autowired
    private CurrencyRepository currencyRepository;

    public CurrencyExchange getExchangeValue(String from, String to) {
        return currencyRepository.findByFromAndTo(from, to);
    }
}
