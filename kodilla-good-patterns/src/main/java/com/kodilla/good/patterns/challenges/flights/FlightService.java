package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightService {

    List<Flights> flightsList = new ArrayList<>();

    public void addFlight(Flights flight) {
        flightsList.add(flight);
    }


    public List<List<Flights>> getFlightsTo(String departuresCity, String arrivalCity) {

        List<Flights> flightFrom = new ArrayList<>();
        flightFrom = flightsList.stream()
                .filter(flight -> flight.getDepartureAirport().equals(departuresCity))
                .toList();

        List<Flights> flightTo = new ArrayList<>();
        flightTo = flightsList.stream()
                .filter(flight -> flight.getArrivalAirport().equals(arrivalCity))
                .toList();

        List<List<Flights>> flightFromTo = new ArrayList<>();
        flightFromTo.add(flightFrom);
        flightFromTo.add(flightTo);

        return flightFromTo;
    }

    public List<Flights> getFlightsBy(String formCity, String viaCity, String toCity) {
        List<Flights> viaFlight = new ArrayList<>();

//        viaFlight = flightsList.stream()
//                .filter()


        if (!viaCity.isEmpty()){

        }

        return viaFlight;
    }
}
