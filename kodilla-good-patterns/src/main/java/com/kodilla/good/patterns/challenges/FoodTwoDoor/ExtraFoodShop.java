package com.kodilla.good.patterns.challenges.FoodTwoDoor;

public class ExtraFoodShop implements Producer {

    @Override
    public void process(Order order) {
        System.out.println("Order in ExtraFoodShop Free Shop has been received");
        System.out.println("The order has been sent for execution");
        System.out.println("The order has been completed");
    }
}
