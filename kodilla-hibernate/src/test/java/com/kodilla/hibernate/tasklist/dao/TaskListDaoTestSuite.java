package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "To do";
    private static final String DESCRIPTION = "Thins that i will have to do";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        //When
        taskListDao.save(taskList);
        //Then
        int id = taskList.getId();
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);

        readTaskList.stream()
                .map(taskList1 -> taskList.getListName())
                .forEach(System.out::println);

        Assert.assertEquals(1, readTaskList.size());
        //taskListDao.delete(readTaskList.get(0));
        taskListDao.deleteById(id);
    }

}
