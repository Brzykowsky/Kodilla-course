package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigmacTestSuite {

    @Test
    public void testBigMacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigMacBuilder()
                .bun("Bułka z sezamem")
                .burgers(2)
                .sauce(Sauce.TID)
                .ingredients("Pomidor", "Cebula" , "Sałąta")
                .build();
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        assertEquals(3,howManyIngredients);
    }
}
