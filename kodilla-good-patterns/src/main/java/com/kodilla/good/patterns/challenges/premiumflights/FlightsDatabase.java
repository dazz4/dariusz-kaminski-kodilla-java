package com.kodilla.good.patterns.challenges.premiumflights;

import java.util.HashSet;

public class FlightsDatabase {
    private final HashSet<Flight> flights = new HashSet<>();

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void getFlightsFrom(City city) {
        System.out.println("Flights from " + city);
        flights.stream()
                .filter(flight -> flight.getFrom().equals(city))
                .map(flight -> flight.toString())
                .forEach(System.out::println);
    }

    public void getFlightsTo(City city) {
        System.out.println("Flights to " + city);
        flights.stream()
                .filter(flight -> flight.getTo().equals(city))
                .map(flight -> flight.toString())
                .forEach(System.out::println);
    }

    public void getFlightsThrough(City city) {
        System.out.println("Flights through " + city);
        flights.stream()
                .filter(flight -> flight.getThrough() != null)
                .filter(flight -> flight.getThrough().equals(city))
                .map(flight -> flight.toString())
                .forEach(System.out::println);
    }
}
