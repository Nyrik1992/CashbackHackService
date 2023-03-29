package ru.netology.service;


import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);


    }

    @org.junit.Test
    public void shouldReturn0IfAmountIs999() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(999);
        int expected = 1;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldReturn0IfAmountIs1001() {
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1001);
        int expected = 999;

        assertEquals(expected, actual);
}
}