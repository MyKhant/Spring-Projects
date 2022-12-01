package com.example.demojdbc;

import com.example.demojdbc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoJdbcApplication {
	@Autowired
	private EmployeeService employeeService;
	public static void main(String[] args) {
		SpringApplication.run(DemoJdbcApplication.class, args);
	}
	@Bean
	public ApplicationRunner runner(){
		return r -> {
			employeeService.listEmail()
					.forEach(System.out::println);
		};
	}
}
