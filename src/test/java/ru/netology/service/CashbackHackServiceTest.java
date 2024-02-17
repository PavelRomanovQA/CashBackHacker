package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testValue(){

        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;

        assertEquals(expected, actual);
    }

    @Test
    public void testRemain(){

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void testBorderAfter(){

        CashbackHackService service = new CashbackHackService();
        int amount = 1999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);
    }
}