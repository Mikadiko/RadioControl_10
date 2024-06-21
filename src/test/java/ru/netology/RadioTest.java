package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

//.............Тесты для громкости звука.....................

    @Test
    public void mustSetVolume() {  // должен установить громкость
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        int expected = 1;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustIncreaseVolume() {  // должен увеличивать  громкость
        Radio rad = new Radio();
        rad.setCurrentVolume(99);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustDecreaseVolume() {  // должен уменьшать  громкость
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustNotSetVolumeAboveMax() {  // Не должен устанавливать громкость выше максимальной
        Radio rad = new Radio();
        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustNotSetVolumeBelowMin() {  // Не должен устанавливать громкость ниже минимальной
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustSetToMaxVolume() { //устанавливаем максимальную громкость
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseVolume();


        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustSetToMinVolume() { //устанавливаем минимальную громкость
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

//.............Тесты для номера радиостанции.....................


    @Test
    public void mustSetRadioStationNumber() {  // должен установить номер радиостанции
        Radio rad = new Radio();
        rad.setRadioStationNumber(1);

        int expected = 1;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustIncreaseRadioStationNumber() {  // должен увеличивать  номер радиостанции
        Radio rad = new Radio();
        rad.setRadioStationNumber(8);
        rad.nextRadioStationNumber();

        int expected = 9;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustDecreaseRadioStationNumber() {  // должен уменьшать  номер радиостанции
        Radio rad = new Radio();
        rad.setRadioStationNumber(1);
        rad.prevRadioStationNumber();

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void transitionMaximumRadioStationNumber() {  // Переход с максимального номера радиостанции
        Radio rad = new Radio();
        rad.setRadioStationNumber(9);
        rad.nextRadioStationNumber();

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustNotSetRadioStationNumberBelowMin() {  // Переход с минимального номера радиостанции
        Radio rad = new Radio();
        rad.setRadioStationNumber(0);
        rad.prevRadioStationNumber();

        int expected = 9;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustSetToMaxRadioStationNumber() { //устанавливаем номер станции выше максимального
        Radio rad = new Radio();
        rad.setRadioStationNumber(10);

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mustSetToMinRadioStationNumber() { //устанавливаем номер станции ниже минимального
        Radio rad = new Radio();
        rad.setRadioStationNumber(-1);

        int expected = 0;
        int actual = rad.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

}