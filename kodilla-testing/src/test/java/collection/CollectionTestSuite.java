package collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;
import java.util.ArrayList;
import java.util.Random;

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
        OddNumbersExterminator exter = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);

        boolean isEmpty = exter.exterminate(numbers).isEmpty();
        System.out.println("Is the list empty: " + isEmpty);
        Assert.assertEquals(false, isEmpty);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator exter = new OddNumbersExterminator();

        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(50));
        }

        System.out.println("Testing the ArrayList");
        for(Integer i : exter.exterminate(numbers)) {
            int oddOrNot = i % 2;
            Assert.assertEquals(0, oddOrNot);
        }

    }
}
