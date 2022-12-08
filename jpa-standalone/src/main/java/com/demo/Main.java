package com.demo;

import com.demo.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        context.registerShutdownHook();
        EmployeeService employeeService = context.getBean(EmployeeService.class);
        employeeService.listEmployee()
                .forEach(System.out::println);
    }
}
