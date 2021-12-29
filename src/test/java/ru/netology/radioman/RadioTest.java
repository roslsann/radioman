package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void setCurrentStation() {
        radio.setCurrentStation(5);
        assertEquals(5, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationLess0() {
        radio.setCurrentStation(-1);
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void setCurrentStationMoreThen9() {
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldnextStationIfCurrent9() {
        radio.setCurrentStation(9);

        int expected = 0;
        int actual = radio.nextStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldnextStationIfCurrent5() {
        radio.setCurrentStation(5);

        int expected = 6;
        int actual = radio.nextStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldprevStationIfCurrent0() {
        radio.setCurrentStation(0);

        int expected = 9;
        int actual = radio.prevStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldprevStationIfCurrent5() {
        radio.setCurrentStation(5);

        int expected = 4;
        int actual = radio.prevStation();

        assertEquals(expected, actual);
    }


}