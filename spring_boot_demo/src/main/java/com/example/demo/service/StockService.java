package com.example.demo.service;

import com.example.demo.dao.StockDao;
import com.example.demo.model.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockService {

    private final StockDao stockDao;

    @Autowired
    public StockService(StockDao stockDao) {
        this.stockDao = stockDao;
    }

    public List<Stock> getAllStocks() {
        return stockDao.findAll();
    }

    public Stock getStockByName(String name) {
        return stockDao.findByName(name);
    }
}
