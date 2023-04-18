package com.kodilla.good.patterns.challenges.chelangeTwo;

public class ProductOrderService {

    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(OrderService orderService, OrderRepository orderRepository) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest){
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getTimeOfOrder(),
                orderRequest.getProduct(), orderRequest.getQuantity());

        if (isOrdered){
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getTimeOfOrder(),
                    orderRequest.getProduct(), orderRequest.getQuantity());
            return new OrderDto(orderRequest.getUser(), true);
        }else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
