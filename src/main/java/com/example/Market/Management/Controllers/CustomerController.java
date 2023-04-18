package com.example.Market.Management.Controllers;

import com.example.Market.Management.Models.Customer;
import com.example.Market.Management.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("customers")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Customer> getAllCustomers() {

        return customerService.getAllCustomers();
    }

    @RequestMapping(value = "getById", method = RequestMethod.GET)
    public Customer getMarketById(@RequestParam Integer id) {
        return customerService.getMarketById(id);
    }
}
