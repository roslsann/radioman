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
    void shouldnextStation() {
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(2, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(3, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(4, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(5, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(7, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(8, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(9, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(2, radio.getCurrentStation());
        radio.nextStation();
        assertEquals(3, radio.getCurrentStation());

    }

    @Test
    void shouldprevStation() {
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(8, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(7, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(6, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(5, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(3, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(2, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(1, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(0, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(8, radio.getCurrentStation());
        radio.prevStation();
        assertEquals(7, radio.getCurrentStation());
    }



    @Test
    void shouldincreaseVolume() {
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(2, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(3, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(4, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(5, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(7, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(8, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(9, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldreduceVolume() {
        radio.setCurrentVolume(10);
        radio.reduceVolume();
        assertEquals(9, radio.getCurrentVolume());
        radio.reduceVolume();
        assertEquals(8, radio.getCurrentVolume());
        radio.reduceVolume();
        assertEquals(7, radio.getCurrentVolume());
        radio.reduceVolume();
        assertEquals(6, radio.getCurrentVolume());
        radio.reduceVolume();
        assertEquals(5, radio.getCurrentVolume());
        radio.reduceVolume();
        assertEquals(4, radio.getCurrentVolume());
        radio.reduceVolume();
        assertEquals(3, radio.getCurrentVolume());
        radio.reduceVolume();
        assertEquals(2, radio.getCurrentVolume());
        radio.reduceVolume();
        assertEquals(1, radio.getCurrentVolume());
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());
        radio.reduceVolume();

    }


}




