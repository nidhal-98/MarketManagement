package com.example.Market.Management.Respositories;

import com.example.Market.Management.Models.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketRepository extends JpaRepository<Market, Integer> {
}
