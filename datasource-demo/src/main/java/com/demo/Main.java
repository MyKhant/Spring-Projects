package com.demo;

import com.demo.service.EmployeeService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ProjectConfig.class);
        context.registerShutdownHook();
        EmployeeService service = context.getBean(EmployeeService.class);
        service.listEmails()
                .forEach(System.out::println);
    }
}
