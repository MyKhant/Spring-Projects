package com.example.jpajdbcdemo;

import com.example.jpajdbcdemo.service.EmployeeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaJdbcDemoApplication implements CommandLineRunner {
    private final EmployeeService employeeService;

    public JpaJdbcDemoApplication(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public static void main(String[] args) {
        SpringApplication.run(JpaJdbcDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        employeeService.deleteAllEmployee();
        try {
            employeeService.createEmployee();
        }catch (Exception e){
            System.out.println(e.getClass().getSimpleName()+" has been caught::");
        }
        employeeService.listAllEmployee()
                .forEach(System.out::println);
    }
}
