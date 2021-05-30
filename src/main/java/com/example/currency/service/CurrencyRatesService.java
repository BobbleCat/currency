package com.example.currency.service;

import com.example.currency.model.CurrencyRates;
import org.springframework.stereotype.Service;

@Service
public class CurrencyRatesService {

    public CurrencyRates getCurrencyRates() {
        // Call the currency rates client
        return new CurrencyRates();
    }
}
