package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldnextStationIfCurrent0() {
        radio.nextStation();
        assertEquals(1, radio.getCurrentStation());
    }

    @Test
    void shouldnextStationIfCurrent5() {
        radio.setCurrentStation(5);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    void shouldnextStationIfCurrent9() {
        radio.setCurrentStation(9);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldprevStationIfCurrent0() {
        radio.prevStation();
        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldprevStationIfCurrent5() {
        radio.setCurrentStation(5);
        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void shouldprevStationIfCurrent9() {
        radio.setCurrentStation(9);
        radio.prevStation();
        assertEquals(8, radio.getCurrentStation());
    }

    @Test
    void shouldincreaseVolumeIfCurrent0() {
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldincreaseVolumeIfCurrent5() {
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }

    @Test
    void shouldincreaseVolumeIfCurrent10() {
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }

    @Test
    void shouldreduceVolumeIfcurrent0() {
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldreduceVolumeIfcurrent5() {
        radio.setCurrentVolume(5);
        radio.reduceVolume();
        assertEquals(4, radio.getCurrentVolume());
    }

    @Test
    void shouldreduceVolumeIfcurrent10() {
        radio.setCurrentVolume(10);
        radio.reduceVolume();
        assertEquals(9, radio.getCurrentVolume());
    }
}




