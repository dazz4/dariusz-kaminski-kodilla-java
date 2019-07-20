package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15.0), theCost);
    }

    @Test
    public void testBasicPizzaGetIngredients() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String ingredients = pizzaOrder.getIngredients();
        //Then
        assertEquals("Pizza with: tomato sauce and cheese", ingredients);
    }

    @Test
    public void testPizzaWithMushroomsGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(16.0), theCost);
    }

    @Test
    public void testPizzaWithMushroomsGetIngredients() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        //When
        String ingredients = pizzaOrder.getIngredients();
        //Then
        assertEquals("Pizza with: tomato sauce and cheese + mushrooms", ingredients);
    }

    @Test
    public void testPizzaWithMushroomsAndJalapenosGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new JalapenosDecorator(pizzaOrder);
        System.out.println("Cost: " + pizzaOrder.getCost() + " PLN");
        //When
        BigDecimal theCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(17.0), theCost);
    }

    @Test
    public void testPizzaWithMushroomsAndJalapenosGetIngredients() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new JalapenosDecorator(pizzaOrder);
        System.out.println(pizzaOrder.getIngredients());
        //When
        String ingredients = pizzaOrder.getIngredients();
        //Then
        assertEquals("Pizza with: tomato sauce and cheese + mushrooms + jalapenos", ingredients);
    }

}