package com.kodilla.good.patterns.challenges.allegrostore;

import java.time.LocalDate;

public class ProductRequest {

    private Product product;
    private User user;
    private LocalDate orderDate;

    public ProductRequest(User user, Product product, LocalDate orderDate) {
        this.product = product;
        this.user = user;
        this.orderDate = orderDate;
    }

    public Product getProduct() {
        return product;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }
}
