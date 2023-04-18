package com.kodilla.good.patterns.challenges.FoodTwoDoor;

public class App {
    public static void main(String[] args) {
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();

        Order order1 = new Order(extraFoodShop, "Butter", 100 );
        Order order2 = new Order(glutenFreeShop, "Milk", 100 );
        Order order3 = new Order(healthyShop, "Salad", 100 );

        extraFoodShop.process(order1);
        System.out.println();
        glutenFreeShop.process(order2);
        System.out.println();
        healthyShop.process(order3);
    }
}
