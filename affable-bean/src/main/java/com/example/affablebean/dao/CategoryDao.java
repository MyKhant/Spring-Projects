package com.example.affablebean.dao;

import com.example.affablebean.ds.Category;
import com.example.affablebean.ds.Product;
import org.springframework.data.repository.CrudRepository;

public interface CategoryDao extends CrudRepository<Category,Integer> {
}
