package ru.netology;

public class Radio {
    private int currentVolume;           // громкость звука
    private int radioStationNumber; // номер радиостанции
    private int maxRadioStation; // желаемое количество радиостанций

    public int getMaxRadioStation() { //получение данных о желаемом количестве радиостанций
        return maxRadioStation;
    }

    public int getCurrentVolume() { // получение данных о громкости звука
        return currentVolume;
    }

    public int getRadioStationNumber() {
        return radioStationNumber;  // получение данных о номере радиостанции
    }

//.............Для громкости звука.....................

    public void setCurrentVolume(int newCurrentVolume) { // изменение данных громкости звука
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        } else {
            this.currentVolume = newCurrentVolume;
        }
    }

    public void increaseVolume() {     // увеличение звука
        if (getCurrentVolume() < 100) {
            this.currentVolume++;
        }
    }

    public void decreaseVolume() {     // уменьшение звука
        if (getCurrentVolume() > 0) {
            this.currentVolume--;
        }
    }

//...............Для номера радиостанции.....................

    public Radio(int desiredNumberOfRadioStations) { //принимает желаемое количество радиостанций и сохраняет это значение у себя в поле
        this.maxRadioStation = desiredNumberOfRadioStations - 1;
    }

    public Radio() { // для отображения количества станций по умолчанию
        this.maxRadioStation = 9;
    }

    public void setRadioStationNumber(int newRadioStationNumber) { // установка данных номера станции

        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > getMaxRadioStation()) {
            return;
        } else {
            this.radioStationNumber = newRadioStationNumber;
        }
    }

    public void nextRadioStationNumber() {     // увеличение номера станции
        if (getRadioStationNumber() != getMaxRadioStation()) {
            radioStationNumber++;
        } else {
            setRadioStationNumber(0);
        }
    }

    public void prevRadioStationNumber() {     // уменьшение номера станции
        if (getRadioStationNumber() != 0) {
            radioStationNumber--;
        } else {
            radioStationNumber = getMaxRadioStation();
        }
    }
}

