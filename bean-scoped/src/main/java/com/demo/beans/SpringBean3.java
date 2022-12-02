package com.demo.beans;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class SpringBean3 {
    public SpringBean3 (){
        System.out.println(this.getClass().getSimpleName()+"::constructor");
    }
}
