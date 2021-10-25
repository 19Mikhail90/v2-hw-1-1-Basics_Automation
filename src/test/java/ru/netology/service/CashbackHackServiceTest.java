package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTest {
    @Test
    void shouldMissingAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actualResult = service.remain(amount);
        int expectedResult = 0;

        Assert.assertEquals(actualResult, expectedResult);
    }
}