package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

//.............Тесты для громкости звука.....................

    @Test
    public void mustNotSetVolumeLessThanMinimum() {  // не должен устанавливать громкость меньше минимального
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void mustSetVolume0() {  // должен установить громкость 0
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void mustSetVolume1() {  // должен установить громкость 1
        Radio rad = new Radio();
        rad.setCurrentVolume(1);

        Assertions.assertEquals(1, rad.getCurrentVolume());
    }

    @Test
    public void mustSetVolume44() {  // должен установить громкость 44
        Radio rad = new Radio();
        rad.setCurrentVolume(44);

        Assertions.assertEquals(44, rad.getCurrentVolume());
    }

    @Test
    public void mustSetVolume99() {  // должен установить громкость 99
        Radio rad = new Radio();
        rad.setCurrentVolume(99);

        Assertions.assertEquals(99, rad.getCurrentVolume());
    }

    @Test
    public void mustSetVolume100() {  // должен установить громкость 100
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        Assertions.assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void mustNotSetVolumeAboveMaximum() {  // не должен устанавливать громкость больше максимального
        Radio rad = new Radio();
        rad.setCurrentVolume(101);

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void mustIncreaseVolume0() {  // должен увеличивать  громкость (0->1)
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.increaseVolume();

        Assertions.assertEquals(1, rad.getCurrentVolume());
    }

    @Test
    public void mustIncreaseVolume1() {  // должен увеличивать  громкость (1->2)
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.increaseVolume();

        Assertions.assertEquals(2, rad.getCurrentVolume());
    }

    @Test
    public void mustIncreaseVolume77() {  // должен увеличивать  громкость (77->78)
        Radio rad = new Radio();
        rad.setCurrentVolume(77);
        rad.increaseVolume();

        Assertions.assertEquals(78, rad.getCurrentVolume());
    }

    @Test
    public void mustIncreaseVolume99() {  // должен увеличивать  громкость (99->100)
        Radio rad = new Radio();
        rad.setCurrentVolume(99);
        rad.increaseVolume();

        Assertions.assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void mustNotIncreaseVolumeAboveMaximum() {  // не должен увеличивать  громкость больше максимального
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.increaseVolume();

        Assertions.assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void mustNotReduceVolumeLessThanMinimum() { //не должен уменьшать громкость меньше минимального
        Radio rad = new Radio();
        rad.setCurrentVolume(0);
        rad.decreaseVolume();

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void mustDecreaseVolume1() {  // должен уменьшать  громкость (1->0)
        Radio rad = new Radio();
        rad.setCurrentVolume(1);
        rad.decreaseVolume();

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void mustDecreaseVolume55() {  // должен уменьшать  громкость (55->54)
        Radio rad = new Radio();
        rad.setCurrentVolume(55);
        rad.decreaseVolume();

        Assertions.assertEquals(54, rad.getCurrentVolume());
    }

    @Test
    public void mustDecreaseVolume99() {  // должен уменьшать  громкость (99->98)
        Radio rad = new Radio();
        rad.setCurrentVolume(99);
        rad.decreaseVolume();

        Assertions.assertEquals(98, rad.getCurrentVolume());
    }

    @Test
    public void mustDecreaseVolume100() {  // должен уменьшать  громкость (100->99)
        Radio rad = new Radio();
        rad.setCurrentVolume(100);
        rad.decreaseVolume();

        Assertions.assertEquals(99, rad.getCurrentVolume());
    }


//.............Тесты для номера радиостанции.....................


    @Test
    public void mustSetToMinRadioStationNumber() { //устанавливаем номер станции ниже минимального -1
        Radio rad = new Radio();
        rad.setRadioStationNumber(-1);


        Assertions.assertEquals(0, rad.getRadioStationNumber());
    }

    @Test
    public void mustSetRadioStationNumber0() {  // должен установить номер радиостанции 0
        Radio rad = new Radio(10);
        rad.setRadioStationNumber(0);


        Assertions.assertEquals(0, rad.getRadioStationNumber());
    }

    @Test
    public void mustSetRadioStationNumber1() {  // должен установить номер радиостанции 1
        Radio rad = new Radio(10);
        rad.setRadioStationNumber(1);


        Assertions.assertEquals(1, rad.getRadioStationNumber());
    }

    @Test
    public void mustSetRadioStationNumber8() {  // должен установить номер радиостанции 8
        Radio rad = new Radio(10);
        rad.setRadioStationNumber(8);


        Assertions.assertEquals(8, rad.getRadioStationNumber());
    }

    @Test
    public void mustSetRadioStationNumber9() {  // должен установить номер радиостанции 9
        Radio rad = new Radio(10);
        rad.setRadioStationNumber(9);


        Assertions.assertEquals(9, rad.getRadioStationNumber());
    }

    @Test
    public void shouldNotSetAboveMaxStationNumber() { // не должен указываться номер станции по умолчанию
        Radio rad = new Radio();
        rad.setRadioStationNumber(10);

        Assertions.assertEquals(0, rad.getRadioStationNumber());
    }

    @Test
    public void mustSetToMaxRadioStationNumber() { //устанавливаем номер станции выше максимального
        Radio rad = new Radio(10);
        rad.setRadioStationNumber(11);


        Assertions.assertEquals(0, rad.getRadioStationNumber());
    }

    @Test
    public void mustSetStationFifteen() { // устанавливаем нужное количество радиостанций
        Radio rad = new Radio(20);
        rad.setRadioStationNumber(15);

        Assertions.assertEquals(15, rad.getRadioStationNumber());
    }


    @Test
    public void mustIncreaseRadioStationNumber0() {  // должен увеличивать (0->1)  номер радиостанции
        Radio rad = new Radio(10);
        rad.setRadioStationNumber(0);
        rad.nextRadioStationNumber();


        Assertions.assertEquals(1, rad.getRadioStationNumber());
    }

    @Test
    public void mustIncreaseRadioStationNumber1() {  // должен увеличивать (1->2)  номер радиостанции
        Radio rad = new Radio(10);
        rad.setRadioStationNumber(1);
        rad.nextRadioStationNumber();


        Assertions.assertEquals(2, rad.getRadioStationNumber());
    }

    @Test
    public void mustIncreaseRadioStationNumber5() {  // должен увеличивать (5->6)  номер радиостанции
        Radio rad = new Radio(10);
        rad.setRadioStationNumber(5);
        rad.nextRadioStationNumber();


        Assertions.assertEquals(6, rad.getRadioStationNumber());
    }

    @Test
    public void mustIncreaseRadioStationNumber() {  // должен увеличивать (8->9)  номер радиостанции
        Radio rad = new Radio(10);
        rad.setRadioStationNumber(8);
        rad.nextRadioStationNumber();


        Assertions.assertEquals(9, rad.getRadioStationNumber());
    }

    @Test
    public void transitionMaximumRadioStationNumber() {  // Переход с максимального (9->0) номера радиостанции
        Radio rad = new Radio(10);
        rad.setRadioStationNumber(9);
        rad.nextRadioStationNumber();


        Assertions.assertEquals(0, rad.getRadioStationNumber());
    }

    @Test
    public void mustNotSetRadioStationNumberBelowMin0() {  // Переход с минимального (0->9) номера радиостанции
        Radio rad = new Radio(10);
        rad.setRadioStationNumber(0);
        rad.prevRadioStationNumber();


        Assertions.assertEquals(9, rad.getRadioStationNumber());
    }

    @Test
    public void mustDecreaseRadioStationNumber1() {  // должен уменьшать (1->0) номер радиостанции
        Radio rad = new Radio(10);
        rad.setRadioStationNumber(1);
        rad.prevRadioStationNumber();


        Assertions.assertEquals(0, rad.getRadioStationNumber());
    }

    @Test
    public void mustDecreaseRadioStationNumber5() {  // должен уменьшать (5->4) номер радиостанции
        Radio rad = new Radio(10);
        rad.setRadioStationNumber(5);
        rad.prevRadioStationNumber();


        Assertions.assertEquals(4, rad.getRadioStationNumber());
    }

    @Test
    public void mustDecreaseRadioStationNumber9() {  // должен уменьшать (9->8) номер радиостанции
        Radio rad = new Radio(10);
        rad.setRadioStationNumber(9);
        rad.prevRadioStationNumber();


        Assertions.assertEquals(8, rad.getRadioStationNumber());
    }

    @Test
    public void mustDecreaseRadioStationNumber8() {  // должен уменьшать (8->7) номер радиостанции
        Radio rad = new Radio(10);
        rad.setRadioStationNumber(8);
        rad.prevRadioStationNumber();


        Assertions.assertEquals(7, rad.getRadioStationNumber());
    }
}