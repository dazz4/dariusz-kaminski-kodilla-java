package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;

interface ProductOrderService {
    boolean orderProduct(User user, Product productName, LocalDate orderDate);
}
