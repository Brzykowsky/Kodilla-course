package com.kodilla.good.patterns.challenges.FoodTwoDoor;

public class App {
    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();

        Order order1 = new Order(extraFoodShop, "Butter", 100 );
        Order order2 = new Order(glutenFreeShop, "Milk", 100 );
        Order order3 = new Order(healthyShop, "Salad", 100 );

        FoodProcessor foodProcessor1 = new FoodProcessor(extraFoodShop);
        FoodProcessor foodProcessor2 = new FoodProcessor(glutenFreeShop);
        FoodProcessor foodProcessor3 = new FoodProcessor(healthyShop);

        String result1 = foodProcessor1.process(order1);
        String result2 = foodProcessor2.process(order2);
        String result3 = foodProcessor3.process(order3);

        System.out.println("Order in ExtraFoodShop: " + result1);
        System.out.println("Order in GlutenFreeShop: " + result2);
        System.out.println("Order in HealthyShop: " + result3);
    }
}
