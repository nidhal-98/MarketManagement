package com.example.Market.Management.Controllers;

import com.example.Market.Management.Models.Market;
import com.example.Market.Management.Services.MarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("markets")
public class MarketController {

    @Autowired
    MarketService marketService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Market> getAllMarkets() {
        return marketService.getAllMarkets();
    }
}
