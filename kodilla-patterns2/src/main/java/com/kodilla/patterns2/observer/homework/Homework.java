package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework implements Observable {
    private final List<String> messages;
    private final List<Observer> observers;
    private final String name;

    public Homework(String name) {
        messages = new ArrayList<>();
        observers = new ArrayList<>();
        this.name = name;
    }

    public void addHomework(String homework) {
        messages.add(homework);
        notifyObservers();
    }

    @Override
    public void registerObservers(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObservers(Observer observer) {
        observers.remove(toString());
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getName() {
        return name;
    }
}
