package com.kodilla.patterns2.observer.forum;

public interface Observable {
    void resgisterObserver(Observer observer);
    void notifyObservers();
    void removeObserver(Observer observer);
}
