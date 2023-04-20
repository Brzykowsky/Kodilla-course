package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    List<Flights> flightsList = new ArrayList<>();

    public void addFlight(Flights flight) {
        flightsList.add(flight);
    }

    public List<Flights> getFlight(String formCity, String viaCity, String toCity) {

        List<Flights> flights = new ArrayList<>();

        if (!viaCity.isEmpty()){
        flights = flightsList.stream()
                .filter(flight -> flight.getDepartureAirport().equals(formCity))
                .filter(flight -> flight.getArrivalAirport().equals(toCity))
                .filter(flight -> flight.getViaAirport().equals(viaCity))
                .collect(Collectors.toList());
        return flights;
        }else {
            flights = flightsList.stream()
                    .filter(flight -> flight.getDepartureAirport().equals(formCity))
                    .filter(flight -> flight.getArrivalAirport().equals(toCity))
                    .collect(Collectors.toList());
            return flights;
        }
    }
}
