package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    Calculator calculator;

    @Test
    public void addTest(){
        //Given
        //When
        calculator.add(10.,1.0);
        //Then
    }

    @Test
    public void subTest(){
        //Given
        //When
        calculator.sub(13.2,11.0);
        //Then
    }

    @Test
    public void mulTest(){
        //Given
        //When
        calculator.mul(2.5,3.0);
        //Then
    }

    @Test
    public void divTest(){
        //Given
        //When
        calculator.div(8.0,2.0);
        //Then
    }
}
