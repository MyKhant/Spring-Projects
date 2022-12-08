package com.example.manyonedemo.ds;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

//    @JoinColumn(name = "category_id_fk")

    @OneToMany(mappedBy = "category",cascade = CascadeType.PERSIST)
    private List<Product> products = new ArrayList<>();
    public void addProduct(Product product){
        product.setCategory(this);
        products.add(product);
    }
}
