package com.demo;

import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class ProjectConfig {

    @Bean
    public static BeanPostProcessor beanPostProcessor(){
        return new CustomBeanPostProcessor();
    }
    @Bean
    public static BeanFactoryPostProcessor beanFactoryPostProcessor(){
        return new CustomBeanFactoryPostProcessor();
    }
}
