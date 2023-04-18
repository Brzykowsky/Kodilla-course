package com.kodilla.good.patterns.challenges.FoodTwoDoor;

public class Order {

    private String product;
    private int quantity;
    private Producer producer;

    public Order(Producer producer, String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.producer = producer;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Producer getProducer() {
        return producer;
    }
}
