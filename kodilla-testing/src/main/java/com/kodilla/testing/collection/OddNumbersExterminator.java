package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {

        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++){

            if (numbers.get(i) % 2 == 0){
                evenNumbers.add(numbers.get(i));
            }
        }
        return evenNumbers;
    }
}
