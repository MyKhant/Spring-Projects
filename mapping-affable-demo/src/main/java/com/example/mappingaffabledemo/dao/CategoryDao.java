package com.example.mappingaffabledemo.dao;

import com.example.mappingaffabledemo.ds.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryDao extends CrudRepository<Category,Integer> {
}
