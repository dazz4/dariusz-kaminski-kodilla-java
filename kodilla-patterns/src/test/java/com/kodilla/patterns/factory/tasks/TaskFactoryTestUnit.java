package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestUnit {
    @Test
    public void testCreatingTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shoppingTask = taskFactory.createTask(TaskFactory.SHOPPINGTASK);
        Task drivingTask = taskFactory.createTask(TaskFactory.DRIVINGTASK);
        Task paintingTask = taskFactory.createTask(TaskFactory.PAINTINGTASK);
        shoppingTask.executeTask();
        drivingTask.executeTask();
        paintingTask.executeTask();
        boolean result = shoppingTask.isTaskExecuted();
        //Then
        Assert.assertEquals("Buy milk", shoppingTask.getTaskName());
        Assert.assertTrue(result);
    }
}
