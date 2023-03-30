package com.kodilla.testing.shape;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.kodilla.testing.shape.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    void testAddFigure(){
        //Given
        //When
        //Then
    }

    @Test
    void testRemoveFigure(){
        //Given
        //When
        //Then
    }

    @Test
    void testGetFigure(){
        //Given
        //When
        //Then
    }

    @Test
    void testShowFigures(){
        //Given
        //When
        //Then
    }
}
