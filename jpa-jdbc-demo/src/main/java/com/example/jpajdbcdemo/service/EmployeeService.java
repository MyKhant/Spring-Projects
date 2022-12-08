package com.example.jpajdbcdemo.service;

import com.example.jpajdbcdemo.dao.EmployeeDao;
import com.example.jpajdbcdemo.dao.EmployeeRepo;
import com.example.jpajdbcdemo.ds.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {
    private final EmployeeRepo employeeRepo;
    private final EmployeeDao employeeDao;

    public EmployeeService(EmployeeRepo employeeRepo, EmployeeDao employeeDao) {
        this.employeeRepo = employeeRepo;
        this.employeeDao = employeeDao;
    }

    public void createEmployee() {
        saveEmployee();

    }
    private void saveEmployee(){

        employeeRepo.save(new Employee("John","William","john@gmail.com",1000));
        employeeRepo.save(new Employee("John","Doe","doe@gmail.com",1000));
        employeeDao.create("Thaw Thaw","Htun Zin","thaw@gmail.com",1000);
        employeeDao.create("Thuza","Nwe","thuza@gmail.com",1000);
    }
    public Iterable<Employee> listAllEmployee(){
        return employeeRepo.findAll();
    }
    public void deleteAllEmployee(){
        employeeRepo.deleteAll();
    }
}
