package com.example.mappingaffabledemo.ds;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter

public class FoodItem extends IdClass{

    private String name;
    private int quantity;

    @ManyToOne
    private Supplier supplier;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal){
        animal.getFoodItems().add(this);
        this.animals.add(animal);
    }
    public FoodItem() {
    }

    public FoodItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
}
