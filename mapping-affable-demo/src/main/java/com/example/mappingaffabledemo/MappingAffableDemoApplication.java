package com.example.mappingaffabledemo;

import com.example.mappingaffabledemo.service.AnimalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MappingAffableDemoApplication implements CommandLineRunner {

    private final AnimalService animalService;

    public MappingAffableDemoApplication(AnimalService animalService) {
        this.animalService = animalService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MappingAffableDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        animalService.createDb();

        JPAUtil.checkData("select * from animal");
        JPAUtil.checkData("select * from category");
        JPAUtil.checkData("select * from supplier");
        JPAUtil.checkData("select * from food_item");
        JPAUtil.checkData("select * from food_item_animals");
        JPAUtil.checkData("select * from cage");
    }
}
