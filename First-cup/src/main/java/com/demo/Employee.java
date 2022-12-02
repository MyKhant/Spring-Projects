package com.demo;

import org.springframework.stereotype.Component;

@Component
public class Employee {

    private String firstName="John";
    private String lastName="William";


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
