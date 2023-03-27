package com.kodilla.testing.calculator;

public class Calculator {

    private Integer a;
    private Integer b;

    public Calculator(Integer a, Integer b){
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }

    public Integer add(int a, int b){
        return a + b;
    }

    public Integer subtract(int a, int b){
        return a - b;
    }
}
