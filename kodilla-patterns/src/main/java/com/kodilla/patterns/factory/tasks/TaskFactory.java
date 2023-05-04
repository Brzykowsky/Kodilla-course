package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String DRIVINGTASK = "Driving Task";
    public static final String PAINTINGTASK = "Painting Task";
    public static final String SHOPPINGTASK = "Shopping Task";

    public final Task createTask(final String taskClass){
        return switch (taskClass){
            case DRIVINGTASK -> new DrivingTask("Drive to target","To main city","Motorcycle");
            case PAINTINGTASK -> new PaintingTask("Self portrait", "Red","Your avatar");
            case SHOPPINGTASK ->  new ShoppingTask("Buy milk","Milk",3);
            default -> null;
        };
    }
}
