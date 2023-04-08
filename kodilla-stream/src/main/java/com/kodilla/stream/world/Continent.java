package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Continent {

    private String nameOfContinent;
    List<Country> listOfCountriesOnContinent;

    public Continent(String nameOfContinent){
        this.nameOfContinent = nameOfContinent;
        listOfCountriesOnContinent = new ArrayList<>();
    }

    public String getNameOfContinent() {
        return nameOfContinent;
    }

    public List<Country> getListOfCountriesInContinent() {
        return listOfCountriesOnContinent;
    }

    public void addCountry(Country country){
        listOfCountriesOnContinent.add(country);
    }
}
