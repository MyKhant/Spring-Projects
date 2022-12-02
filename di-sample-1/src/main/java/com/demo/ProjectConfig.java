package com.demo;

import com.demo.beans.Address;
import com.demo.beans.Hobby;
import com.demo.beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ProjectConfig {
//    @Bean @Autowired
//    public Student student(Address test, Hobby hobby){
//        Student student = new Student(test,hobby);
//
//        return student;
//    }
//    @Bean
//    public Address address() {
//        Address address = new Address();
//
//        return address;
//    }
//    @Bean
//    public Hobby hobby(){
//        return new Hobby();
//    }
}
