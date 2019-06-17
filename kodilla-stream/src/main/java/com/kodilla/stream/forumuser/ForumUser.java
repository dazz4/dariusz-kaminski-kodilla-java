package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String userName;
    private final char gender;
    private final LocalDate dateOfBirth;
    private final int totalPosts;

    public ForumUser(final int id, final String userName, final char gender,
                     final int yearOfBirth, final int monthOfBirth, final int dayOfBirth,
                     final int totalPosts) {
        this.id = id;
        this.userName = userName;
        this.gender = gender;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.totalPosts = totalPosts;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getTotalPosts() {
        return totalPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", totalPosts=" + totalPosts +
                '}';
    }
}
