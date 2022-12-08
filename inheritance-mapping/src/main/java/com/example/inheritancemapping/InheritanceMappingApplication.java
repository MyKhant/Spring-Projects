package com.example.inheritancemapping;

import com.example.inheritancemapping.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InheritanceMappingApplication implements CommandLineRunner {
    @Autowired
    private VetService vetService;
    public static void main(String[] args) {
        SpringApplication.run(InheritanceMappingApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        vetService.createDb();

//        JPAUtil.checkData("select * from vet");
        JPAUtil.checkData("select * from in_house_vet");
        JPAUtil.checkData("select * from ex_house_vet");
    }
}
