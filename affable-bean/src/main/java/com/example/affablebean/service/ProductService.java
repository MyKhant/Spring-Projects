package com.example.affablebean.service;

import com.example.affablebean.dao.CategoryDao;
import com.example.affablebean.dao.ProductDao;
import com.example.affablebean.ds.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ProductService {

    @Autowired
    private final CategoryDao categoryDao;

    @Autowired
    private final ProductDao productDao;

    public ProductService(CategoryDao categoryDao, ProductDao productDao) {
        this.categoryDao = categoryDao;
        this.productDao = productDao;
    }

    public void createDb(){
        Category c1 = new Category();
        c1.setName("Fruit");
        Category c2 = new Category();
        c2.setName("Diary");

        Product p1 = new Product("Apple",2000,"fresh fruit", LocalDate.now());
        Product p2 = new Product("Orange",1000,"fresh fruit", LocalDate.now());
        Product p3 = new Product("Milk",2000,"fresh diary", LocalDate.now());
        Product p4 = new Product("Butter",2500,"fresh diary", LocalDate.now());

        Customer customer1 = new Customer("John Doe","093883938","john@gmail.com","Love Lane","Yangon","111");
        Customer customer2 = new Customer("Thomas Hardy","093854555","hardy@gmail.com","Dream Land","Yangon","222");

        Customer_Order customer_order1 = new Customer_Order(2.5,LocalDate.now(),12345);
        Customer_Order customer_order2 = new Customer_Order(3,LocalDate.now(),1234);
        Customer_Order customer_order3 = new Customer_Order(4,LocalDate.now(),1234);
        Customer_Order customer_order4 = new Customer_Order(2,LocalDate.now(),1234);

        Ordered_Product ordered_product1 = new Ordered_Product();
        ordered_product1.setQuantity(30);
        Ordered_Product ordered_product2 = new Ordered_Product();
        ordered_product2.setQuantity(20);
        Ordered_Product ordered_product3 = new Ordered_Product();
        ordered_product3.setQuantity(10);
        Ordered_Product ordered_product4 = new Ordered_Product();
        ordered_product4.setQuantity(5);

        c1.addProduct(p1);
        c1.addProduct(p2);
        c2.addProduct(p3);
        c2.addProduct(p4);

        customer1.addCustomerOrder(customer_order1);
        customer1.addCustomerOrder(customer_order2);
        customer2.addCustomerOrder(customer_order3);
        customer2.addCustomerOrder(customer_order4);

        customer_order1.addOrderProcuct(ordered_product1);
        p1.addOrderProduct(ordered_product1);

        customer_order2.addOrderProcuct(ordered_product2);
        p2.addOrderProduct(ordered_product2);

        customer_order3.addOrderProcuct(ordered_product3);
        p3.addOrderProduct(ordered_product3);

        customer_order4.addOrderProcuct(ordered_product4);
        p4.addOrderProduct(ordered_product4);

        categoryDao.save(p1);
        categoryDao.save(p2);

    }
}
