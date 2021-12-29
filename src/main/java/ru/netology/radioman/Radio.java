package ru.netology.radioman;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0)
            return currentStation = 9;

        if (newCurrentStation > 9)
            return currentStation = 0;

        this.currentStation = newCurrentStation;
        return newCurrentStation;
    }

    public int nextStation() {

        int nextStation = currentStation + 1;
        if (nextStation > 9)
            return currentStation = 0;

        return nextStation;
    }

    public int prevStation() {

        int prevStation = currentStation - 1;
        if (prevStation < 0)
            return currentStation = 9;

        return prevStation;
    }
}
