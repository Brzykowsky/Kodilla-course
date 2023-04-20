package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Flights {

    private String departureAirport;
    private String arrivalAirport;
    private String viaAirport;

    public Flights(String departureAirport ,String viaAirport , String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.viaAirport = viaAirport;
    }

    public Flights(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getViaAirport() {
        return viaAirport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flights flights = (Flights) o;

        if (!Objects.equals(departureAirport, flights.departureAirport))
            return false;
        if (!Objects.equals(arrivalAirport, flights.arrivalAirport))
            return false;
        return Objects.equals(viaAirport, flights.viaAirport);
    }

    @Override
    public int hashCode() {
        int result = departureAirport != null ? departureAirport.hashCode() : 0;
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (viaAirport != null ? viaAirport.hashCode() : 0);
        return result;
    }
}
