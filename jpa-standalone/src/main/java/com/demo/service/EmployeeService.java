package com.demo.service;

import com.demo.dao.EmployeeDao;
import com.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    public Iterable<Employee> listEmployee(){
        return employeeDao.findAll();
    }
}
