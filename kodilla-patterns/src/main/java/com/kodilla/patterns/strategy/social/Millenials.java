package com.kodilla.patterns.strategy.social;

public class Millenials extends User {
    String name;

    public Millenials(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
