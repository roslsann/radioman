package ru.netology.radioman;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numberOfStations = 10;


    public Radio() {
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }


    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            currentStation = numberOfStations -1;
        }

        if (currentStation > numberOfStations - 1) {
            currentStation = 0;
        }

        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation >= numberOfStations -1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation <= 0) {
            currentStation = numberOfStations -1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}






