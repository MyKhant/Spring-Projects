package com.example.mappingaffabledemo.service;

import com.example.mappingaffabledemo.dao.CategoryDao;
import com.example.mappingaffabledemo.dao.SupplierDao;
import com.example.mappingaffabledemo.ds.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AnimalService {

    private final CategoryDao categoryDao;

    private final SupplierDao supplierDao;

    public AnimalService(CategoryDao categoryDao, SupplierDao supplierDao) {
        this.categoryDao = categoryDao;
        this.supplierDao = supplierDao;
    }


    @Transactional
    public void createDb(){
        Category cat1 = new Category();
        cat1.setCategoryType("NormalPet");
        Category cat2 = new Category();
        cat2.setCategoryType("DancePet");

        Animal a1 = new Animal("Dog",3);
        Animal a2 = new Animal("Monkey", 2);

        Cage cag1 = new Cage(1,"North");
        Cage cag2 = new Cage(2,"West");

        FoodItem f1 = new FoodItem("Sweet",2);
        FoodItem f2 = new FoodItem("Banana",3);

        Supplier s1 = new Supplier("Jon Doe", "09736833","Yangon");
        Supplier s2 = new Supplier("Jon William", "097637732","Mandalay");

        cat1.addAnimal(a1);
        cat2.addAnimal(a2);

        cag1.setAnimal(a1);
        cag2.setAnimal(a2);

        a1.setCage(cag1);
        a2.setCage(cag2);

        f1.addAnimal(a1);
        f2.addAnimal(a2);

        s1.addFoodItem(f1);
        s2.addFoodItem(f2);

        categoryDao.save(cat1);
        categoryDao.save(cat2);

        supplierDao.save(s1);
        supplierDao.save(s2);
    }
}
