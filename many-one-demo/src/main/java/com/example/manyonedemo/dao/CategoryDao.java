package com.example.manyonedemo.dao;

import com.example.manyonedemo.ds.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryDao extends CrudRepository<Category,Integer> {
}
