package com.demo.beans;

import org.springframework.stereotype.Component;

public class SpringBean1 {
    public SpringBean1(SpringBean2 springBean2) {
        System.out.println(
                this.getClass().getSimpleName()+"::constructor"
        );
    }
}
