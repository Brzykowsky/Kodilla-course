package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoggerTestSuite {



    @Test
    public void getLastLog1(){
        //Given
        Logger logger = new Logger();
        //When
        logger.log("log1");
        logger.log("log2");
        //Then
        assertEquals("log2",logger.getLastLog());
    }

    @Test
    public void getLastLog2(){

        //Given
        Logger2 logger2 = Logger2.LOG;
        Logger2 logger21 = Logger2.LOG;
        //When
        //Then
        assertEquals(logger2, logger21);

    }
}
