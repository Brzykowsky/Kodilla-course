package com.kodilla.testing.shape;

public class Square implements Shape {

    private double side;
    private String name = "Kwadrat";

    public Square(double side){
        this.side = side;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        double area = side * side;
        return area;
    }

    public double getSide() {
        return side;
    }
}

