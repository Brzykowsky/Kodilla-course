package com.kodilla.good.patterns.challenges.flights;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Flights {

    private String departureAirport;
    private String arrivalAirport;
    private String viaAirport;
    private LocalDateTime timeOfDeparture;

    public Flights(String departureAirport ,String viaAirport , String arrivalAirport, LocalDateTime timeOfDeparture) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.viaAirport = viaAirport;
        this.timeOfDeparture = timeOfDeparture;
    }

    public Flights(String departureAirport, String arrivalAirport, LocalDateTime timeOfDeparture) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.timeOfDeparture = timeOfDeparture;
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

    public LocalDateTime getTimeOfDeparture() {
        return timeOfDeparture;
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
        if (!Objects.equals(viaAirport, flights.viaAirport)) return false;
        return Objects.equals(timeOfDeparture, flights.timeOfDeparture);
    }

    @Override
    public int hashCode() {
        int result = departureAirport != null ? departureAirport.hashCode() : 0;
        result = 31 * result + (arrivalAirport != null ? arrivalAirport.hashCode() : 0);
        result = 31 * result + (viaAirport != null ? viaAirport.hashCode() : 0);
        result = 31 * result + (timeOfDeparture != null ? timeOfDeparture.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        if (viaAirport != null && !viaAirport.isEmpty()) {
            return "Flights{" +
                    "departureAirport='" + departureAirport + '\'' +
                    ", arrivalAirport='" + arrivalAirport + '\'' +
                    ", viaAirport='" + viaAirport + '\'' +
                    ", timeOfDeparture=" + timeOfDeparture +
                    '}';
        }else {
            return "Flights{" +
                    "departureAirport='" + departureAirport + '\'' +
                    ", arrivalAirport='" + arrivalAirport + '\'' +
                    ", timeOfDeparture=" + timeOfDeparture +
                    '}';
        }
    }
}
