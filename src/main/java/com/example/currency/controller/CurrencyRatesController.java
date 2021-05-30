package com.example.currency.controller;


import com.example.currency.model.CurrencyRates;
import com.example.currency.service.CurrencyRatesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CurrencyRatesController {

    @Autowired
    public CurrencyRatesService currencyRatesService;

    @GetMapping("/rates")
    public CurrencyRates currencyRates(){
        return currencyRatesService.getCurrencyRates();
    }
}
