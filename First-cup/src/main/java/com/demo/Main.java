package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Employee employee = new Employee();
//        employee.setFirstName("Jhon");
//        employee.setLastName("Doe");
//        System.out.println(employee.getFirstName() + " " + employee.getLastName());

        ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Employee employee=context.getBean("employee",Employee.class);
        System.out.println(employee.getFirstName() + " " + employee.getLastName());
        ((AnnotationConfigApplicationContext)context).close();;
    }
}
