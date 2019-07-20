package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashSet;

public class Order {
    public HashSet<Product> listOfProducts;
    private int orderId;
    private User user;
    private Shop shop;

    public Order(int orderId, User user, Shop shop, HashSet<Product> listOfProducts) {
        this.orderId = orderId;
        this.user = user;
        this.shop = shop;
        this.listOfProducts = listOfProducts;
    }

    public HashSet<Product> getListOfProducts() {
        return listOfProducts;
    }

    @Override
    public String toString() {
        return "Order #: " + orderId + "\n" +
                "User: " + user + "\n" +
                "Shop: " + shop + "\n" +
                "List of products: " + listOfProducts + "\n";
    }
}
