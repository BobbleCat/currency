package com.example.currency.controller;


import com.example.currency.model.CurrencyRates;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyRatesController {

    @GetMapping("/rates")
    public CurrencyRates currencyRates(){
        return new CurrencyRates();
    }
}
