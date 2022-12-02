package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Student {

    @Autowired
    private Address add;

    @Autowired
    private Hobby hobby;
    @Autowired
    public Student(Address add){
        System.out.println("Address in constructor::"+ add.getClass().getSimpleName());
        System.out.println("Hobby in constructor::"+ hobby);
    }
//    @PostConstruct
    public void postConstruct(){
        System.out.println("Address in constructor::"+ add.getClass().getSimpleName());
        System.out.println("Hobby in constructor::"+ hobby.getClass().getSimpleName());
    }
//    @Autowired
    public Student(Address add, Hobby hobby) {
        this.add = add;
        this.hobby = hobby;
        System.out.println("Address in constructor::"+ add.getClass().getSimpleName());
        System.out.println("Hobby in constructor::"+ hobby.getClass().getSimpleName());
    }

    @Autowired
    public void setAdd(Address add) {
        this.add = add;
    }
    @Autowired
    public void setHobby(Hobby hobby) {
        this.hobby = hobby;
    }

    private String name="John William";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String studentInfo(){
        return name + "::" + add.getStreetName()+"::"+hobby.getName();
    }


}
