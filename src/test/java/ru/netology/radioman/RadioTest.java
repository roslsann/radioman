package ru.netology.radioman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    Radio radio = new Radio();

    @Test
    void shouldsetCurrentIfNumberOfStationFromConstructor() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(13);
        assertEquals(13, radio.getCurrentStation());
    }

    @Test
    void shouldsetCurrentIfSetMoreThenMax() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(16);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldsetCurrentIfSetLessThenMin() {
        Radio radio = new Radio(15);
        radio.setCurrentStation(-1);
        assertEquals(14, radio.getCurrentStation());
    }

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
    void shouldnextStationIfCurrent17() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(17);
        radio.nextStation();
        assertEquals(18, radio.getCurrentStation());
    }

    @Test
    void shouldnextStationIfCurrentFromConstructorMoreMax() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(19);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldprevStationIfCurrentFromConstructor() {
        Radio radio = new Radio(20);
        radio.setCurrentStation(13);
        radio.prevStation();
        assertEquals(12, radio.getCurrentStation());
    }

    @Test
    void shouldprevStationIfCurrentFromConstrukctorLessMin() {
        Radio radio = new Radio(20);
        radio.prevStation();
        assertEquals(19, radio.getCurrentStation());
    }

    @Test
    void shouldincreaseVolumeIfCurrent0() {
        radio.increaseVolume();
        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldincreaseVolumeIfCurrent50() {
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    void shouldincreaseVolumeIfCurrent10() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldreduceVolumeIfcurrent0() {
        radio.reduceVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldreduceVolumeIfcurrent55() {
        radio.setCurrentVolume(55);
        radio.reduceVolume();
        assertEquals(54, radio.getCurrentVolume());
    }

    @Test
    void shouldreduceVolumeIfcurrent100() {
        radio.setCurrentVolume(100);
        radio.reduceVolume();
        assertEquals(99, radio.getCurrentVolume());
    }
}




