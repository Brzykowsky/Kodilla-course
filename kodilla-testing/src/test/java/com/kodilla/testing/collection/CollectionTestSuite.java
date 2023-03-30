package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

class CollectionTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case 2: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case 2: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite 2: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite 2: end");
    }

    @DisplayName("when create a list with Integer, then exterminate should returns even numbers")
    @Test
    void testOddNumbersExterminatorNormalList(){

        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> listToCompare = new ArrayList<>();
        for (int i = 0; i < 100; i++){
            oddNumbers.add(i);
        }

        for (int i = 0; i < 100; i = i + 2){
            listToCompare.add(i);
        }

        List<Integer> result = oddNumbersExterminator.exterminate(oddNumbers);
        Assertions.assertEquals(result, listToCompare);
    }

    @DisplayName("checking that class is working properly when list is empty")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyList1 = new ArrayList<>();
        List<Integer> emptyList2 = new ArrayList<>();

        List<Integer> result = oddNumbersExterminator.exterminate(emptyList1);
        Assertions.assertEquals(emptyList2,result);
    }
}
