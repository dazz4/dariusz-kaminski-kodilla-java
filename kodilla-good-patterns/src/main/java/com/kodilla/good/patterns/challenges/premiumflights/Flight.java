package com.kodilla.good.patterns.challenges.premiumflights;

import java.time.LocalDate;

public final class Flight {
    private final LocalDate date;
    private final City from;
    private final City to;
    private City through;

    public Flight(final City from, final City to, final LocalDate date) {
        this.date = date;
        this.from = from;
        this.to = to;
    }

    public Flight(final City from, City through, final City to, final LocalDate date) {
        this(from, to, date);
        this.through = through;
    }

    public City getFrom() {
        return from;
    }

    public City getTo() {
        return to;
    }

    public City getThrough() {
        return through;
    }

    @Override
    public String toString() {
        if(through == null) {
            return "Flight " + from + " -> " + to + " (" + date + ")";
        } else {
            return "Flight " + from + " -> " + through + " -> " + to + " (" + date + ")";
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (date != null ? !date.equals(flight.date) : flight.date != null) return false;
        if (from != null ? !from.equals(flight.from) : flight.from != null) return false;
        if (to != null ? !to.equals(flight.to) : flight.to != null) return false;
        return through != null ? through.equals(flight.through) : flight.through == null;
    }

    @Override
    public int hashCode() {
        int result = date != null ? date.hashCode() : 0;
        result = 31 * result + (from != null ? from.hashCode() : 0);
        result = 31 * result + (to != null ? to.hashCode() : 0);
        result = 31 * result + (through != null ? through.hashCode() : 0);
        return result;
    }
}
