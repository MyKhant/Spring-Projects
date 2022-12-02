package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean1 {
    @Value("#{'${app.name}'.toUpperCase()}")
    public String appName;
    @Value("#{2*(3-1)+5}")
    private int amount;
    @Value("#{springBean2.num}")
    private int num1;
    public void printProperties(){
        System.out.println("AppName :: "+appName);
        System.out.println("Amount :: "+amount);
        System.out.println("SpringBean2'num :: "+num1);
    }

}
