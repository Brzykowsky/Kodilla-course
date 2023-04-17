package com.kodilla.exception.test;

public class Main {
    public static void main(String[] args) throws RouteNotFoundException {

        FlightSearcher flightSearcher = new FlightSearcher();

        Flight flight1 = new Flight("Warsaw", "Paris");
        Flight flight2 = new Flight("New York", "Berlin");
        Flight flight3 = new Flight("Budapest", "Rzeszów");
        Flight flight4 = new Flight("Ibiza", "Berlin");
        Flight flight5 = new Flight("Kraków", "Warsaw");
        Flight flight6 = new Flight("Budapest", "Kraków");
        Flight flight7 = new Flight("Kraków", "Moscow");

        try {
            flightSearcher.findFlight(flight1);
            flightSearcher.findFlight(flight2);
            flightSearcher.findFlight(flight3);
            flightSearcher.findFlight(flight4);
            flightSearcher.findFlight(flight5);
            flightSearcher.findFlight(flight6);
            flightSearcher.findFlight(flight7);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
