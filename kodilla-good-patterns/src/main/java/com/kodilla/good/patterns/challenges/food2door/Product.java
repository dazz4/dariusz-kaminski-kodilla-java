package com.kodilla.good.patterns.challenges.food2door;

public class Product {
    private String productName;
    private String productType;
    private int quantity;

    public Product() {
    }

    public Product(String productName, String productType, int quantity) {
        this.productName = productName;
        this.productType = productType;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        return productName != null ? productName.equals(product.productName) : product.productName == null;
    }

    @Override
    public int hashCode() {
        return productName != null ? productName.hashCode() : 0;
    }

    @Override
    public String toString() {
        return productName;
    }
}
