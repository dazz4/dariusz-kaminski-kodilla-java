package com.kodilla.good.patterns.challenges.AllegroStore;

import java.time.LocalDate;

public class ProductOrderRepository {
    boolean createOrder(User user, Product product, LocalDate orderDate){
        System.out.println("Adding order to the database...");
        return true;
    }
}
