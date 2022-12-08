package com.example.inheritancemapping.ds;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class IdClass {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
}
