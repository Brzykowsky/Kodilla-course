package com.kodilla.testing.shape;

public class Circle implements Shape{

    private String name = "Koło";
    private double radius;
    private double pi = 3.14;

    public Circle(double radius){
        this.radius = radius;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        double area = pi * ( radius * radius);
        return area;
    }
}
