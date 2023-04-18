package com.example.Market.Management.Controllers;

import com.example.Market.Management.Models.Invoice;
import com.example.Market.Management.Services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("invoices")
public class InvoiceController {

    @Autowired
    InvoiceService invoiceService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Invoice> getAllCustomers() {

        return invoiceService.getAllInvoices();
    }

    @RequestMapping(value = "getById", method = RequestMethod.GET)
    public Invoice getMarketById(@RequestParam Integer id) {
        return invoiceService.getMarketById(id);
    }
}