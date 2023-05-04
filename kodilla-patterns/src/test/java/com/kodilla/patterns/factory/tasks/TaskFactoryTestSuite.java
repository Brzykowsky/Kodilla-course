package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    public void testDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task drivingTask = taskFactory.createTask("Driving Task");
        //Then
        assertEquals("Driving task has been executed", drivingTask.executeTask());
        assertEquals(true,drivingTask.isTaskExecuted());
        assertEquals("Drive to target",drivingTask.getTaskName());
    }

    @Test
    public void testPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task paintingTask = taskFactory.createTask("Painting Task");
        //Then
        assertEquals("Painting task has been executed", paintingTask.executeTask());
        assertEquals(true, paintingTask.isTaskExecuted());
        assertEquals("Self portrait", paintingTask.getTaskName());
    }

    @Test
    public void testShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.createTask("Shopping Task");
        //Then
        assertEquals("Shopping task has been executed", shoppingTask.executeTask());
        assertEquals(true, shoppingTask.isTaskExecuted());
        assertEquals("Buy milk", shoppingTask.getTaskName());
    }
}
