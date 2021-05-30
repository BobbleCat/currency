package com.example.currency.controller;


import com.example.currency.model.CurrencyRates;
import com.example.currency.service.CurrencyRatesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CurrencyRatesController {

    public CurrencyRatesService currencyRatesService = new CurrencyRatesService();

    @GetMapping("/rates")
    public CurrencyRates currencyRates(){
        return currencyRatesService.getCurrencyRates();
    }
}
