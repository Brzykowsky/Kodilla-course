package com.kodilla.good.patterns.challenges.FoodTwoDoor;

public class FoodProcessor {
    final Producer producer;

    public FoodProcessor(Producer producer) {
        this.producer = producer;
    }

    public String process(final Order order) {

        producer.process(order);
        return "Succes";
    }
}