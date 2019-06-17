package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> listOfContinents = new ArrayList<>();

    public void addContinent(Continent continent) {
        listOfContinents.add(continent);
    }

    public List<Continent> getListOfContinents() {
        return listOfContinents;
    }

//    public BigDecimal getPeopleQuantity() {
//        return listOfContinents.stream()
//                .map(continent -> continent.getPopulationOfCountries())
//                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
//    }

    public BigDecimal getPeopleQuantity() {
        return listOfContinents.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }

    @Override
    public String toString() {
        return "World{" +
                "listOfContinents=" + listOfContinents +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        World world = (World) o;

        return listOfContinents != null ? listOfContinents.equals(world.listOfContinents) : world.listOfContinents == null;
    }

    @Override
    public int hashCode() {
        return listOfContinents != null ? listOfContinents.hashCode() : 0;
    }
}
