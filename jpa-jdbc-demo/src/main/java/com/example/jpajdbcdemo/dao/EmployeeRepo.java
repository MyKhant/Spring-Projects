package com.example.jpajdbcdemo.dao;

import com.example.jpajdbcdemo.ds.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<Employee,Integer> {
}
