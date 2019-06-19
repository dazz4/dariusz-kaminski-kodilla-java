package com.kodilla.spring.portfolio;

import javafx.concurrent.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {
    TaskList taskList;

    @Bean
    public Board getBoard() {
        return new Board(taskList);
    }

    @Bean
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean
    public TaskList doneList() {
        return new TaskList();
    }

}
