package com.kodilla.exception.test.flight;

import java.util.HashMap;
import java.util.Map;

public class FlightSearcher {

    private Map<String, Boolean> airports = new HashMap<>();

    public FlightSearcher() {
        airports.put("Warsaw", true);
        airports.put("Berlin", false);
        airports.put("Paris", true);
        airports.put("New York ", true);
        airports.put("Budapest", false);
        airports.put("Rzeszów", true);
        airports.put("Rome", true);
        airports.put("Ibiza", false);
        airports.put("Golden Sands", true);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {
        if (!airports.containsKey(flight.getDepartureAirport())) {
            throw new RouteNotFoundException("Departure airport not found");
        }

        if (!airports.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException("Arrival airport not found");
        }

        if (!airports.containsValue(flight.getDepartureAirport())){
            throw new RouteNotFoundException("Departure airport is inaccessible");
        }

        if (!airports.containsValue(flight.getArrivalAirport())){
            throw new RouteNotFoundException("Arrival airport is inaccessible");
        }

        if (!airports.containsKey(flight.getDepartureAirport())
                && !airports.containsKey(flight.getArrivalAirport())){
            throw new RouteNotFoundException("Airports not found");
        }
    }

    @Override
    public String toString() {
        return "FlightSearcher{" +
                "airports=" + airports +
                '}';
    }
}

