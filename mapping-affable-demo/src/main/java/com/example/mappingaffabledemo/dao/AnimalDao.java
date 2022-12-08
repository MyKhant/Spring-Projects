package com.example.mappingaffabledemo.dao;

import com.example.mappingaffabledemo.ds.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalDao extends CrudRepository<Animal,Integer> {
}
