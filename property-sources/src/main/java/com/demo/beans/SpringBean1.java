package com.demo.beans;

import org.ocpsoft.prettytime.PrettyTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SpringBean1 {
    @Autowired
    private PrettyTime prettyTime;
    @Value("${app.name}")
    private String appName;
    @Value("${app.id}")
    private int appId;
    @Value("${JAVA_HOME}")
    private String javaHome;
    @Value("${my.vm.name}")
    private String vmProperties;
    @Autowired
    public SpringBean1(SpringBean2 springBean2,@Nullable MyInterface myInterface){
//        System.out.println(springBean2.getClass().getSimpleName());
    }
    public void printProperties(){
        System.out.println("AppName:"+appName);
        System.out.println("AppId:"+appId);
        System.out.println("JavaHome:"+javaHome);
        System.out.println("VMproperties:"+vmProperties);
    }
    @Autowired
    public void printBean(List<BeanInterface> beanInterfaces){
        beanInterfaces.forEach(
                a -> System.out.println(a.getClass().getSimpleName())
        );
    }
}
