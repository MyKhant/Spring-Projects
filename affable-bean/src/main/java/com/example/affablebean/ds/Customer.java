package com.example.affablebean.ds;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Customer extends IdClass{

    private String name;
    private String phone;
    private String email;
    private String address;
    private String city_region;
    private String cc_number;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.PERSIST)
    private List<Customer_Order> customer_orders = new ArrayList<>();


    public Customer() {
    }

    public Customer(String name, String phone, String email, String address, String city_region, String cc_number) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.city_region = city_region;
        this.cc_number = cc_number;
    }

    public void addCustomerOrder(Customer_Order customer_order) {
        customer_order.setOrdered_products(this);
        this.ordered_products.add(ordered_product);
    }
}
