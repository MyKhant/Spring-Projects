package com.example.mappingaffabledemo.ds;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Animal extends IdClass{
    private String type;
    private int totalNo;

    @ManyToMany(mappedBy = "animals",cascade = CascadeType.PERSIST)
    private List<FoodItem> foodItems = new ArrayList<>();
    @ManyToOne
    private Category category;
    @OneToOne(mappedBy = "animal",cascade = CascadeType.PERSIST)
    private Cage cage;
//    public void addFoodItem(FoodItem foodItem){
//        foodItem.setAnimals((List<Animal>) this);
//        this.foodItems.add(foodItem);
//    }
    public Animal() {
    }

    public Animal(String type, int totalNo) {
        this.type = type;
        this.totalNo = totalNo;
    }
}
