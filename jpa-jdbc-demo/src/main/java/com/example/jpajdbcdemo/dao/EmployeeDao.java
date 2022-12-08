package com.example.jpajdbcdemo.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class EmployeeDao {
    private JdbcTemplate jdbcTemplate;
    public EmployeeDao(DataSource dataSource){
        jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
    }
    public void create(String firstName, String lastName, String email, double salary){
        if(firstName.equalsIgnoreCase("thuza")){
            throw new RuntimeException(firstName + " is not illegal.");
        }
        jdbcTemplate.update("insert into employee(first_name,last_name,email,salary)" +
                "values (?,?,?,?)",
                firstName,
                lastName,
                email,
                salary
        );
    }
}
