package ru.netology;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void beforeBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void thenAmountZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void afterBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1005;
        int actual = service.remain(amount);
        int expected = 995;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void afterMinusBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = -5;
        int actual = service.remain(amount);
        int expected = 1005;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void amountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}