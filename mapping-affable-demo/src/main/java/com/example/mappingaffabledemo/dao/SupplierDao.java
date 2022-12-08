package com.example.mappingaffabledemo.dao;

import com.example.mappingaffabledemo.ds.Supplier;
import org.springframework.data.repository.CrudRepository;

public interface SupplierDao extends CrudRepository<Supplier,Integer> {
}
