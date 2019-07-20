package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before() {
        System.out.println("Test case: begin");
    }

    @After
    public void after() {
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        System.out.println("Testing if ArrayList is empty.");
        //Given
        OddNumbersExterminator ext = new OddNumbersExterminator();
        ArrayList<Integer> oddAndEven = new ArrayList<>();

        //When
        ArrayList<Integer> result = ext.exterminate(oddAndEven);

        //Then
        Assert.assertNull(result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        System.out.println("Testing if returned ArrayList consists only even numbers.");
        //Given
        OddNumbersExterminator ext = new OddNumbersExterminator();
        ArrayList<Integer> oddAndEven = new ArrayList<>();
        oddAndEven.add(1);
        oddAndEven.add(2);
        oddAndEven.add(3);
        oddAndEven.add(4);

        ArrayList<Integer> onlyEven = new ArrayList<>();
        onlyEven.add(2);
        onlyEven.add(4);

        //When
        ArrayList<Integer> result = ext.exterminate(oddAndEven);

        //Then
        Assert.assertEquals(onlyEven, result);
    }
}
