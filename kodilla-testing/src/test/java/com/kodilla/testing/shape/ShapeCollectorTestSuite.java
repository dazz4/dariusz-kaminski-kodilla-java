package com.kodilla.testing.shape;
import org.junit.*;
import shape.Shape;
import shape.ShapeCollector;
import shape.Square;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTest() {
        System.out.println("Testing...");
    }

    @AfterClass
    public static void afterAllTest() {
        System.out.println("All test are finished.");
    }

    @Before
    public void beforeTest() {
        testCounter++;
        System.out.println("Test #:" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape theFigure = new Square(10, 10);

        //When
        collector.addFigure(theFigure);

        //Then
        Assert.assertEquals(1, collector.getFiguresQuantity());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape theFigure = new Square(10, 10);
        collector.addFigure(theFigure);

        //When
        Shape retrievedShape;
        retrievedShape = collector.getFigure(0);

        //Then
        Assert.assertEquals(theFigure, retrievedShape);
    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape theFigure = new Square(10, 10);

        //When
        boolean result = collector.removeFigure(theFigure);

        //Then
        Assert.assertFalse(result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape theFigure = new Square(10, 10);
        collector.addFigure(theFigure);

        //When
        boolean result = collector.removeFigure(theFigure);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(0, collector.getFiguresQuantity());
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Shape theFigure = new Square(10, 10);
        collector.addFigure(theFigure);

        //When
        String result = "Square: 100.0\n";

        //Then
        Assert.assertEquals(result, collector.showFigures());
    }

}
