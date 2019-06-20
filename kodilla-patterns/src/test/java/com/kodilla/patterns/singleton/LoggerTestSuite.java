package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public void testLoggerLog() {
        //Given
        //When
        Logger.getInstance().log("Test log");
        String result = Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Test log", result);
    }
}
