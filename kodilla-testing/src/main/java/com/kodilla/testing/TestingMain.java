package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

import java.util.Random;


public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Random random = new Random();

        Integer a = random.nextInt(100);
        Integer b = random.nextInt(100);

        Calculator calculator = new Calculator(a,b);



        Integer result1 = calculator.add(a,b);
        Integer result2 = calculator.subtract(a,b);

        if (result1.equals(a + b) && result2.equals(a - b)){
            System.out.println("Test 2 OK");
        }else {
            System.out.println("Error!");
        }

    }
}
