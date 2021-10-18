package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CashbackHackServiceTest {
    @Test
    void shouldMissingAmount() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actualResult = service.remain(amount);
        int expectedResult = 100;

        assertEquals(expectedResult, actualResult);
    }
}