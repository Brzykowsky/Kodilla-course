package com.kodilla.good.patterns.challenges.chelangeTwo;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        OrderService orderService = new OrderService();
        OrderRepository orderRepository = new OrderRepository();

        User userKrystian = new User("Krystian", "Brzyk", "krystianbrzyk@vp.pl");
        LocalDateTime timeOfOrder = LocalDateTime.of(2023, 4, 20, 14, 30, 0);
        OrderRequest orderRequest = new OrderRequest(userKrystian, timeOfOrder,"Butter",2);

        ProductOrderService productOrderService = new ProductOrderService(orderService, orderRepository);

        productOrderService.process(orderRequest);
    }
}
