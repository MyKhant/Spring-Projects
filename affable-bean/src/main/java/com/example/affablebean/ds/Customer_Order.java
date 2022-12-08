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
public class Customer_Order extends IdClass{

    private double amount;
    private LocalDate date_created;
    private int confirmation_number;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "customer_order",cascade = CascadeType.PERSIST)
    private List<Ordered_Product> ordered_products = new ArrayList<>();

    public Customer_Order() {
    }

    public Customer_Order(double amount, LocalDate date_created, int confirmation_number) {
        this.amount = amount;
        this.date_created = date_created;
        this.confirmation_number = confirmation_number;
    }

}
