package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

interface ProductRepository {
    boolean createOrder(User user, Product productName, LocalDate orderDate);
}
