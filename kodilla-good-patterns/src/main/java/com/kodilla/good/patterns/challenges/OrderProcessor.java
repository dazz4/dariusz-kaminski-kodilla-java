package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductRepository productRepository;

    public OrderProcessor(InformationService informationService,
                          ProductOrderService productOrderService,
                          ProductRepository productRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productRepository = productRepository;
    }

    public OrderDTo process(final ProductRequest productRequest) {
        boolean isAvailable = productOrderService.orderProduct(productRequest.getUser(),
                productRequest.getProduct(), productRequest.getOrderDate());
        if(isAvailable) {
            informationService.orderConfirmation(productRequest.getUser());
            productRepository.createOrder(productRequest.getUser(), productRequest.getProduct(), productRequest.getOrderDate());
            return new OrderDTo(productRequest.getUser(), true);
        } else {
            return new OrderDTo(productRequest.getUser(), false);
        }
    }
}
