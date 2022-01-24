package ru.netology.radioman;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int numberOfStation = 10;

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            currentStation = numberOfStation -1;
        }

        if (currentStation > numberOfStation -1) {
            currentStation = 0;
        }

        this.currentStation = currentStation;
    }

    public void nextStation() {
        if (currentStation >= numberOfStation -1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void prevStation() {
        if (currentStation <= 0) {
            currentStation = numberOfStation -1;
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






