package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();
        String result;

        try {

            result = secondChallenge.probablyIWillThrowException(2.1, 1.5);
            System.out.println(result);

        } catch (Exception e) {

            System.out.println("Error: " + e);
            e.printStackTrace();

        } finally {

            System.out.println("I'm always here.");

        }

    }

}
