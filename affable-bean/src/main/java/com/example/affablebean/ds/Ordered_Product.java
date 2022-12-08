package com.example.affablebean.ds;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Ordered_Product extends IdClass{

    private int quantity;
//    @OneToMany(mappedBy = "customer_order",cascade = CascadeType.PERSIST)
    @ManyToOne
    private Customer_Order customer_order;

    @ManyToOne
    private Product product;



//    public Ordered_Product() {
//    }
//
//    public Ordered_Product(int quantity) {
//
//        this.quantity = quantity;
//    }
}
