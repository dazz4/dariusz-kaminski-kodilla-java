package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //Then
        board.toDoList.tasks.add("todo1");
        board.toDoList.tasks.add("todo2");
        board.inProgressList.tasks.add("taskInProgress1");
        board.inProgressList.tasks.add("taskInProgress2");
        board.doneList.tasks.add("taskDone1");
        board.doneList.tasks.add("taskDone2");

        board.toDoList.tasks.stream()
                .map(s -> s.toString())
                .forEach(System.out::println);

        board.inProgressList.tasks.stream()
                .map(s -> s.toString())
                .forEach(System.out::println);

        board.doneList.tasks.stream()
                .map(s -> s.toString())
                .forEach(System.out::println);
    }
}
