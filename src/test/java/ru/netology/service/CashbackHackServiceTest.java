package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;


public class CashbackHackServiceTest {
    @Test
    void shouldMissingAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int actualResult = service.remain(amount);
        int expectedResult = 200;

        Assert.assertEquals(actualResult, expectedResult);
    }
}