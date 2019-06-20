package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .burgers(2)
                .bun("normal")
                .sauce("bbq")
                .ingredient("cheese")
                .ingredient("cucumber")
                .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(1, howManyIngredients);
    }
}
