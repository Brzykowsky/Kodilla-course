package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        int [] arrayNumbers = {2,4,6,8,10,12,14,16,18,20};
        //When
        double testingAverageMethod = ArrayOperations.getAverage(arrayNumbers);
        //Then
        Assertions.assertEquals(11,testingAverageMethod,0.0001);
    }
}
