package com.kodilla.good.patterns.challenges.premiumflights;

import org.junit.Test;

import java.time.LocalDate;

public class PremiumFlightsTestSuite {
    @Test
    public void testSearchFlights() {
        //Given
        FlightsDatabase flightsDatabase = new FlightsDatabase();
        City gdansk = new City("Gdansk");
        City wroclaw = new City("Wroclaw");
        City warsaw = new City("Warsaw");
        City london = new City("London");
        City birmingham = new City("Birmingham");
        City bangkok = new City("Bangkok");
        Flight fromGdansk1 = new Flight(gdansk, wroclaw, LocalDate.now());
        Flight fromGdansk2 = new Flight(gdansk, london, LocalDate.now().plusDays(5));
        Flight fromGdansk3 = new Flight(gdansk, birmingham, LocalDate.now().plusDays(10));
        Flight fromWroclaw1 = new Flight(wroclaw, london, LocalDate.now());
        Flight fromWroclaw2 = new Flight(wroclaw, warsaw, LocalDate.now());
        Flight fromWroclaw3 = new Flight(wroclaw, warsaw, bangkok, LocalDate.now());
        Flight fromLondon = new Flight(london, warsaw, wroclaw, LocalDate.now());
        //When
        flightsDatabase.addFlight(fromGdansk1);
        flightsDatabase.addFlight(fromGdansk2);
        flightsDatabase.addFlight(fromGdansk3);
        flightsDatabase.addFlight(fromWroclaw1);
        flightsDatabase.addFlight(fromWroclaw2);
        flightsDatabase.addFlight(fromWroclaw3);
        flightsDatabase.addFlight(fromLondon);
        //Then
        flightsDatabase.getFlightsFrom(wroclaw);
        flightsDatabase.getFlightsTo(london);
        flightsDatabase.getFlightsThrough(warsaw);
    }
}
