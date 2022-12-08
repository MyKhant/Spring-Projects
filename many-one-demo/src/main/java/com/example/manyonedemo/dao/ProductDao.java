package com.example.manyonedemo.dao;

import com.example.manyonedemo.ds.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductDao extends CrudRepository<Product, Integer> {
}
