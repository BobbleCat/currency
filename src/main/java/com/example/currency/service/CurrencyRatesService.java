package com.example.currency.service;

import com.example.currency.client.CurrencyRatesClient;
import com.example.currency.model.CurrencyRates;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CurrencyRatesService {

    private final CurrencyRatesClient currencyRatesClient;

    public CurrencyRates getCurrencyRates() {
        // Call the currency rates client
        return new CurrencyRates();
    }
}
