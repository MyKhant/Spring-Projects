package com.example.inheritancemapping.dao;

import com.example.inheritancemapping.ds.InHouseVet;
import org.springframework.data.repository.CrudRepository;

public interface InHouseVetDao extends CrudRepository<InHouseVet,Integer> {
}
