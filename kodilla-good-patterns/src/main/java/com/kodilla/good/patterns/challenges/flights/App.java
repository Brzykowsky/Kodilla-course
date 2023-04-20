package com.kodilla.good.patterns.challenges.flights;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Flights flight1 = new Flights("Warszawa", "Kraków",
                LocalDateTime.of(2023, 4,20,14,32));
        Flights flight2 = new Flights("Warszawa", "Kraków",
                LocalDateTime.of(2023, 5,18,12,33));
        Flights flight3 = new Flights("Warszawa", "Kraków","Radom",
                LocalDateTime.of(2023, 6,12,10,34));
        Flights flight4 = new Flights("Warszawa","Wrocław","Kraków",
                LocalDateTime.of(2023, 10,21,8,35));
        Flights flight5 = new Flights("Warszawa", "Rzeszów","Wrocłąw",
                LocalDateTime.of(2023, 6,23,6,36));
        Flights flight6 = new Flights("Warszawa", "Kraków",
                LocalDateTime.of(2023, 8,20,14,37));
        Flights flight7 = new Flights("Gdańsk", "Wrocław","Rzeszów",
                LocalDateTime.of(2023, 8,26,4,38));
        Flights flight8 = new Flights("Warszawa", "Kraków",
                LocalDateTime.of(2023, 12,24,1,39));
        Flights flight9 = new Flights("Warszawa", "Kraków",
                LocalDateTime.of(2023, 12,23,2,30));
        Flights flight10 = new Flights("Warszawa", "Kraków",
                LocalDateTime.of(2023, 10,2,13,31));

        FlightService flightService = new FlightService();
        flightService.addFlight(flight1);
        flightService.addFlight(flight2);
        flightService.addFlight(flight3);
        flightService.addFlight(flight4);
        flightService.addFlight(flight5);
        flightService.addFlight(flight6);
        flightService.addFlight(flight7);
        flightService.addFlight(flight8);
        flightService.addFlight(flight9);
        flightService.addFlight(flight10);

        List<Flights> flights = flightService.getFlight("Warszawa", "","Kraków");
        System.out.println(flights);
        System.out.println(flights.size());
    }
}
