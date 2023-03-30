package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private double height;
    private double base;
    private String name = "Trójkąt";

    public Triangle(double height, double base){
        this.height = height;
        this.base = base;
    }

    public String getShapeName() {
        return name;
    }

    public double getField() {
        double area = (height * base)/2;
        return area;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }
}

