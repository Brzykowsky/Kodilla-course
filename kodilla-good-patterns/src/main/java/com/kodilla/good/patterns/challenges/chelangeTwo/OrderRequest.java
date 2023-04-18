package com.kodilla.good.patterns.challenges.chelangeTwo;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime timeOfOrder;
    private String product;
    private int quantity;

    public OrderRequest(User user, LocalDateTime timeOfOrder, String product, int quantity) {
        this.user = user;
        this.timeOfOrder = timeOfOrder;
        this.product = product;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getTimeOfOrder() {
        return timeOfOrder;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
