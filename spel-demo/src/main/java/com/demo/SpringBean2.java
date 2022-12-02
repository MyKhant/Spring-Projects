package com.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean2 {
    @Value("11")
    public int num;
}
