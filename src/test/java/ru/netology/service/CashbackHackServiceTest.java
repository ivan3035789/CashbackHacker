package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void iMustOfferToSpendAnother100IfTheAmountIs900Junit4() {
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test
    public void youShouldOfferToSpendZeroIfTheAmountIs1000Junit4() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @Test
    public void iMustOfferToSpendAnother500IfTheAmountIs1500Junit4() {
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @org.junit.jupiter.api.Test
    public void iMustOfferToSpendAnother100IfTheAmountIs900Junit5() {
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void youShouldOfferToSpendZeroIfTheAmountIs1000Junit5() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void iMustOfferToSpendAnother500IfTheAmountIs1500Junit5() {
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;
        Assertions.assertEquals(expected, actual);
    }

}