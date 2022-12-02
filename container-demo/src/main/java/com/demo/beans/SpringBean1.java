package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SpringBean1 {
    private SpringBean2 springBean2;
    public SpringBean1(){
        System.out.println(this.getClass().getSimpleName()+":: constructor");
    }
    @Autowired
    public void setSpringBean2(SpringBean2 springBean2) {
        System.out.println(this.getClass().getSimpleName()+
                " injected to by setter::"+this.getClass().getSimpleName());
        this.springBean2 = springBean2;
    }
    @PostConstruct
    public void init(){
        System.out.println(this.getClass().getSimpleName()+"::@PostConstruct");
    }
    @PreDestroy
    public void destroy(){
        System.out.println(this.getClass().getSimpleName()+"::@PreDestroy");
    }
    public String sayGreeting(){
        return "Hello!";
    }
}
