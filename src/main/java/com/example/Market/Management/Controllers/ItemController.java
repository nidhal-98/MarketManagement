package com.example.Market.Management.Controllers;

import com.example.Market.Management.Models.Customer;
import com.example.Market.Management.Models.Item;
import com.example.Market.Management.Services.CustomerService;
import com.example.Market.Management.Services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("items")
public class ItemController {

    @Autowired
    ItemService itemService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Item> getAllItems() {

        return itemService.getAllItems();
    }
}
