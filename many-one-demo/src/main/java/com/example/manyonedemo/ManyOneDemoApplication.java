package com.example.manyonedemo;

import com.example.manyonedemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManyOneDemoApplication implements CommandLineRunner {
    @Autowired
    private ProductService productService;

    public static void main(String[] args) {
        SpringApplication.run(ManyOneDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productService.createDb();
        JPAUtil.checkData("select * from category");
        JPAUtil.checkData("select * from product");
        JPAUtil.checkData("select * from my_category_my_product");
    }
}
