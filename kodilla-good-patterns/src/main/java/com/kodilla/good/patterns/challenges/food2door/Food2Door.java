package com.kodilla.good.patterns.challenges.food2door;

import java.util.HashSet;

public class Food2Door {
    public static void main(String[] args) {
        User user = new User("Jan", "Kowalski");
        ExtraFoodShop extraFoodShop = new ExtraFoodShop("Extra Food Shop");
        HealthyShop healthyShop = new HealthyShop("Healthy Shop");
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("Gluten Free Shop");
        Product product1 = new Product("Lean beef", "Meat", 100);
        Product product2 = new Product("Carrots", "Veg", 45);
        Product product3 = new Product("Oranges", "Fruits", 77);
        Product product4 = new Product("Toilet paper", "Toiletries", 5);
        Product product5 = new Product("Toothpaste", "Meat", 100);
        Product product6 = new Product("Gluten free pasta", "Pasta", 55);

        extraFoodShop.addProduct(product1);
        extraFoodShop.addProduct(product4);
        extraFoodShop.addProduct(product5);
        healthyShop.addProduct(product2);
        healthyShop.addProduct(product3);
        glutenFreeShop.addProduct(product6);

        HashSet<Product> newOrder1 = new HashSet<>();
        newOrder1.add(product1);
        newOrder1.add(product4);
        Order order = new Order(1, user, extraFoodShop, newOrder1);
        extraFoodShop.process(order);

        HashSet<Product> newOrder2 = new HashSet<>();
        newOrder2.add(product2);
        Order order2 = new Order(2, user, healthyShop, newOrder2);
        healthyShop.process(order2);

        HashSet<Product> newOrder3 = new HashSet<>();
        newOrder3.add(product1);
        Order order3 = new Order(3, user, glutenFreeShop, newOrder3);
        glutenFreeShop.process(order3);
    }
}
