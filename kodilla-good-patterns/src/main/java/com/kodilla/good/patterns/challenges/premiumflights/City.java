package com.kodilla.good.patterns.challenges.premiumflights;

public final class City {
    private final String cityName;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city1 = (City) o;

        return cityName != null ? cityName.equals(city1.cityName) : city1.cityName == null;
    }

    @Override
    public int hashCode() {
        return cityName != null ? cityName.hashCode() : 0;
    }

    @Override
    public String toString() {
        return cityName;
    }
}
