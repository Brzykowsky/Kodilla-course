package com.kodilla.spring.calculator;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class Calculator {

    private final Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public void add(double a, double b){
        double result = a + b;
        display.displayValue(result);
    }
    public void sub(double a, double b){
        double result = a - b;
        display.displayValue(result);
    }
    public void mul(double a, double b){
        double result = a * b;
        display.displayValue(result);
    }
    public void div (double a, double b){
        double divResult = a / b;
        display.displayValue(divResult);
    }
}
