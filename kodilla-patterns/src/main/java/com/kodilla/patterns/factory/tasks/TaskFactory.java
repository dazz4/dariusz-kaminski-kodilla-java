package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task createTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPINGTASK:
                return new ShoppingTask("Buy milk", "milk", 1);
            case PAINTINGTASK:
                return new PaintingTask("Paint your face", "red", "face");
            case DRIVINGTASK:
                return new DrivingTask("Drive to you school", "school", "car");
            default:
                return null;
        }
    }

}
