package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan
public class ProjectConfig {
    @Bean @Profile({"file","db"})
    public SpringBean2 springBean2(){
        return new SpringBean2();
    }

}
