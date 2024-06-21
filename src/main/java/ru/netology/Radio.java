package ru.netology;

public class Radio {
    private int currentVolume;           // громкость звука
    private int radioStationNumber; // номер радиостанции

    public int getCurrentVolume() { // получение данных о громкости звука
        return currentVolume;
    }

    public int getRadioStationNumber() {
        return radioStationNumber;  // получение данных о номере радиостанции
    }

//.............Для громкости звука.....................

    public void setCurrentVolume(int newCurrentVolume) { // изменение данных громкости звука
        if (newCurrentVolume >= 0 && newCurrentVolume <= 100) {
            this.currentVolume = newCurrentVolume;
        } else {
            return;
        }
    }

    public void increaseVolume() {     // увеличение звука
        if (getCurrentVolume() < 100) {
            this.currentVolume += 1;
        }
    }

    public void decreaseVolume() {     // уменьшение звука
        if (getCurrentVolume() > 0) {
            this.currentVolume -= 1;
        }
    }

//...............Для номера радиостанции.....................


    public void setRadioStationNumber(int newRadioStationNumber) { // установка данных номера станции

        if (newRadioStationNumber >= 0 && newRadioStationNumber <= 9) {
            this.radioStationNumber = newRadioStationNumber;
        } else {
            return;
        }
    }

    public void nextRadioStationNumber() {     // увеличение номера станции
        if (getRadioStationNumber() == 9) {
            setRadioStationNumber(0);
        } else {
            this.radioStationNumber++;
        }
    }

    public void prevRadioStationNumber() {     // уменьшение номера станции
        if (getRadioStationNumber() == 0) {
            setRadioStationNumber(9);
        } else {
            this.radioStationNumber--;
        }
    }
}

