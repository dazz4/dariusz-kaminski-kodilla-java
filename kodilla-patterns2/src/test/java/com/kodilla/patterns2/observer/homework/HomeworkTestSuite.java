package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeworkTestSuite {
    @Test
    public void testHomework() {
        //Given
        Homework springHomework = new SpringHomework();
        Homework restapriHomework = new RestApiHomework();
        Mentor johnSmith = new Mentor("John Smith");
        Mentor marcinNowak = new Mentor("Marcin Nowak");
        Mentor alicjaZalewska = new Mentor("Alicja Zalewska");
        springHomework.registerObservers(johnSmith);
        restapriHomework.registerObservers(johnSmith);
        springHomework.registerObservers(marcinNowak);
        restapriHomework.registerObservers(alicjaZalewska);
        //When
        springHomework.addHomework("Homework submitted from Dariusz Kaminski");
        springHomework.addHomework("Homework submitted from Jolanta Jamrozek");
        restapriHomework.addHomework("Homework submitted from Tadeusz Marciniak");
        //Then
        assertEquals(3, johnSmith.getUpdateCount());
        assertEquals(2, marcinNowak.getUpdateCount());
        assertEquals(1, alicjaZalewska.getUpdateCount());
    }
}