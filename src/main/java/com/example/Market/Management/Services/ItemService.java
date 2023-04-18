package com.example.Market.Management.Services;

import com.example.Market.Management.Models.Item;
import com.example.Market.Management.Respositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAllItems() {

        return itemRepository.findAll();
    }

    public Item getMarketById(Integer id) {
        return itemRepository.findById(id).get();
    }
}
