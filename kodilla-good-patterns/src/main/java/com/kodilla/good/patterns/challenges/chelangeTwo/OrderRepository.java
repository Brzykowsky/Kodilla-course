package com.kodilla.good.patterns.challenges.chelangeTwo;

import java.time.LocalDateTime;

public class OrderRepository implements OrderRepositoryInterface{
    @Override
    public void createOrder(User user, LocalDateTime localDateTime, String product, int quantity) {
        System.out.println("Order by " + user + " has been created\n" + "user oredered: " + quantity + " "
                        + product + "\n" + "at: " + localDateTime);

    }
}
