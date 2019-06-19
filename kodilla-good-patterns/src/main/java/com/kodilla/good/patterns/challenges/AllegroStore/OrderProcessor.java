package com.kodilla.good.patterns.challenges.AllegroStore;

public class OrderProcessor {

    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;

    public OrderProcessor(InformationService informationService,
                          ProductOrderService productOrderService,
                          ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public OrderDTo process(final ProductRequest productRequest) {
        boolean isAvailable = productOrderService.orderProduct(productRequest.getUser(),
                productRequest.getProduct(), productRequest.getOrderDate());
        if(isAvailable) {
            informationService.orderConfirmation(productRequest.getUser());
            productOrderRepository.createOrder(productRequest.getUser(), productRequest.getProduct(), productRequest.getOrderDate());
            return new OrderDTo(productRequest.getUser(), true);
        } else {
            return new OrderDTo(productRequest.getUser(), false);
        }
    }
}
