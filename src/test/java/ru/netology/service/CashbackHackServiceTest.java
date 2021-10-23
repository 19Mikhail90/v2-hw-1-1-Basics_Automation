package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {
    @Test
    public void shouldMissingAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actualResult = service.remain(amount);
        int expectedResult = 0;

        Assert.assertEquals(actualResult, expectedResult);
    }
}