package com.demo.beans;

import org.springframework.stereotype.Component;

@Component
public class Hobby {
    private String name="Swimming";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
