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
    void shouldsetCurrentStationLessThenMinConstructor() {
        Radio radio = new Radio(0,0,20);
        radio.setCurrentStation(-1);
        assertEquals(19, radio.getCurrentStation());
    }

    @Test
    void shouldsetCurrentStationMoreThenMaxConstructor() {
        Radio radio = new Radio(0,0,20);
        radio.setCurrentStation(21);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldnextStationIfCurrentFromConstructor() {
        Radio radio = new Radio(0,0,20);
        radio.setCurrentStation(15);
        radio.nextStation();
        assertEquals(16, radio.getCurrentStation());
    }

    @Test
    void shouldnextStationIfCurrentFromConstructorMoreMax() {
        Radio radio = new Radio(0,0,20);
        radio.setCurrentStation(19);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldprevStationIfCurrentFromConstruktor() {
        Radio radio = new Radio(0,0,20);
        radio.setCurrentStation(15);
        radio.prevStation();
        assertEquals(14, radio.getCurrentStation());
    }

    @Test
    void shouldprevStationIfCurrentFromConstruktorLessMin() {
        Radio radio = new Radio(0,0,20);
        radio.setCurrentStation(0);
        radio.prevStation();
        assertEquals(19, radio.getCurrentStation());
    }

    @Test
    void shouldincreaseVolumeIfCurrent55() {
        radio.setCurrentVolume(55);
        radio.increaseVolume();
        assertEquals(56, radio.getCurrentVolume());
    }

    @Test
    void shouldincreaseVolumeIfCurrent100() {
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




