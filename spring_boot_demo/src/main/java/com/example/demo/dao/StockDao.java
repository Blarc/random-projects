package com.example.demo.dao;

import com.example.demo.model.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockDao extends MongoRepository<Stock, String> {

    Stock findByName(String name);
}
