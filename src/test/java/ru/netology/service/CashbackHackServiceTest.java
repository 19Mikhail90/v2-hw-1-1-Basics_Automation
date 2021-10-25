package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashbackHackServiceTest {
    @Test
    void shouldMissingAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actualResult = service.remain(amount);
        int expectedResult = 0;

        assertEquals(expectedResult, actualResult);
    }
}