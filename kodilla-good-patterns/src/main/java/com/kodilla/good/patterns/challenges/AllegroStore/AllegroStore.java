package com.kodilla.good.patterns.challenges.AllegroStore;

import java.time.LocalDate;

public class AllegroStore {
    public static void main(String[] args) {
        User user = new User("Jan", "Kowalski");
        Product product = new Product("Klapki");
        LocalDate orderDate = LocalDate.now();

        InformationService informationService = new InformationService();
        ProductOrderService productOrderService = new ProductOrderService();
        ProductOrderRepository productRepository = new ProductOrderRepository();

        OrderProcessor orderProcessor = new OrderProcessor(informationService,
                productOrderService, productRepository);
        ProductRequest productRequest = new ProductRequest(user, product, orderDate);

        orderProcessor.process(productRequest);
    }
}
