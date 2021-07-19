package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void iMustOfferToSpendAnother100IfTheAmountIs900() {
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual,expected);
    }

    @Test
    public void youShouldOfferToSpendZeroIfTheAmountIs1000() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual,expected);

    }

    @Test
    public void iMustOfferToSpendAnother500IfTheAmountIs1500() {
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(actual,expected);
    }

}