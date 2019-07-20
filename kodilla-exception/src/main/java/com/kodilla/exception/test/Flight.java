package com.kodilla.exception.test;

import java.util.HashMap;

public class Flight {
    String departureAirport;
    String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> flightMap = new HashMap<>();

        flightMap.put("Warsaw", true);
        flightMap.put("London", false);
        flightMap.put("Gdansk", true);
        flightMap.put("Krakow", true);

        if (flightMap.containsKey(flight.getArrivalAirport())) {

            System.out.println("This airport exists on out system.");

        } else {

            throw new RouteNotFoundException("This airport doesn't exist on our system.");

        }

    }
}
