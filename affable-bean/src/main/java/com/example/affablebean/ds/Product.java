package com.example.affablebean.ds;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Product extends IdClass{

    private String name;
    private double price;
    private String description;
    private LocalDate last_update;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "product",cascade = CascadeType.PERSIST)
    private List<Ordered_Product> ordered_products = new ArrayList<>();

    public Product() {
    }

    public Product(String name, double price, String description, LocalDate last_update) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.last_update = last_update;
    }
    public void addOrderProduct(Ordered_Product ordered_product){
        ordered_product.setProduct(this);
        this.ordered_products.add(ordered_product);
    }
}
