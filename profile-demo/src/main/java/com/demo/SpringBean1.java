package com.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component @Profile("db")
public class SpringBean1 {
    public SpringBean1(){
        System.out.println(
                this.getClass().getSimpleName()+"::constructor."

        );
    }
}
