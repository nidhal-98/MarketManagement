package com.example.Market.Management.Services;

import com.example.Market.Management.Models.Invoice;
import com.example.Market.Management.Respositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {

    @Autowired
    InvoiceRepository invoiceRepository;

    public List<Invoice> getAllInvoices() {

        return invoiceRepository.findAll();
    }

}