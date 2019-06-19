package com.kodilla.good.patterns.challenges.allegrostore;

public class OrderDTo {

    public User user;

    public OrderDTo(final User user, final boolean isAvailable) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

}
