package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent africa = new Continent("Africa");
        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Country poland = new Country("Poland", new BigDecimal("60000000"));
        Country france = new Country("France", new BigDecimal("70000000"));
        Country china = new Country("China", new BigDecimal("6000000000"));
        Country russia = new Country("Russia", new BigDecimal("200000000"));
        Country uganda = new Country("Uganda", new BigDecimal("9000000"));
        Country egypt = new Country("Egypt", new BigDecimal("3000000"));

        //When
        world.addContinent(africa);
        world.addContinent(europe);
        world.addContinent(asia);
        asia.addCountry(china);
        asia.addCountry(russia);
        europe.addCountry(poland);
        europe.addCountry(france);
        africa.addCountry(uganda);
        africa.addCountry(egypt);

        //When
        BigDecimal totalPopulationOfAsia = asia.getPopulationOfCountries();
        BigDecimal totalPopulationOfEurope = europe.getPopulationOfCountries();
        BigDecimal totalPopulationOfAfrica = africa.getPopulationOfCountries();
        BigDecimal totalPopulationOfWorld = world.getPeopleQuantity();

        //Then
        Assert.assertEquals(totalPopulationOfAsia, new BigDecimal("6200000000"));
        Assert.assertEquals(totalPopulationOfAfrica, new BigDecimal("12000000"));
        Assert.assertEquals(totalPopulationOfEurope, new BigDecimal("130000000"));
        Assert.assertEquals(totalPopulationOfWorld, new BigDecimal("6342000000"));


    }
}
