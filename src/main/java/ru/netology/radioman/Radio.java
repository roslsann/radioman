package ru.netology.radioman;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }


    public int setCurrentStation(int CurrentStation) {
        if (CurrentStation < 0)
            return currentStation = 9;

        if (CurrentStation > 9)
            return currentStation = 0;

        this.currentStation = CurrentStation;
        return CurrentStation;
    }

    public void nextStation() {

        if (currentStation >= 9) {
            currentStation = 0;
        }
        else currentStation = currentStation + 1;

        }

    public void prevStation() {

        if (currentStation <= 0) {
            currentStation = 9;
        }
        else currentStation = currentStation - 1;
            }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}






