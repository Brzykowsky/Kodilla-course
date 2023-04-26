package com.kodilla.spring.portfolio;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {


    @Test
    public void testTaskAdd(){

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("Task1");
        board.getInProgressList().getTasks().add("Task2");
        board.getDoneList().getTasks().add("Task2");
        //Then
        assertEquals(1,board.getToDoList().getTasks().size());
        assertEquals(1,board.getInProgressList().getTasks().size());
        assertEquals(1,board.getDoneList().getTasks().size());

    }
}
