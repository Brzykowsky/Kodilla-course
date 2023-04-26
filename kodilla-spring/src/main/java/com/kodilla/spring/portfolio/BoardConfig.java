package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class BoardConfig {

    @Bean(name = "Task to Do")
    public TaskList toDoList(){
        return new TaskList();
    }

    @Bean(name = "Task in Progress")
    public TaskList inProgressList(){
        return new TaskList();
    }

    @Bean(name = "Done Tasks")
    public TaskList doneTasks(){
        return new TaskList();
    }

    @Bean
    public Board board(){
        return new Board(toDoList(), inProgressList(),doneTasks());
    }
}
