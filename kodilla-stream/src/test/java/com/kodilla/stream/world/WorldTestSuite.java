package com.kodilla.stream.world;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.math.BigDecimal;

public class WorldTestSuite {

    @DisplayName("Test of World Package")
    @Test
    void testGetPeopleQuantity() {
        // Given
        World world = new World();
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");

        Country poland = new Country("Polska", new BigDecimal("111111111"));
        Country germany = new Country("Niemcy", new BigDecimal("111111111"));
        Country france = new Country("Francja", new BigDecimal("111111111"));
        Country china = new Country("Chiny", new BigDecimal("111111111"));
        Country japan = new Country("Japonia", new BigDecimal("111111111"));
        Country india = new Country("Indie", new BigDecimal("111111111"));
        Country nigeria = new Country("Nigeria", new BigDecimal("111111111"));
        Country rpa = new Country("RPA", new BigDecimal("111111111"));
        Country kenya = new Country("Kenia", new BigDecimal("111111111"));

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        asia.addCountry(china);
        asia.addCountry(japan);
        asia.addCountry(india);
        africa.addCountry(nigeria);
        africa.addCountry(rpa);
        africa.addCountry(kenya);

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        //When
        BigDecimal result = world.getPeopleQuantity();
        BigDecimal compare = new BigDecimal("999999999");

        //Then,
        Assertions.assertEquals(compare, result);
    }
}
