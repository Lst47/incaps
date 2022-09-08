import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void MaxSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void MinSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void NotValidSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(11);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void MinusSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void setNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setNextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void MaxSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.setNextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void MinSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setNextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void aboveMaxSetNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setNextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void setPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        radio.setPrevStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void MaxSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.setPrevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void MinSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.setPrevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void AboveMinSetPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.setPrevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);

        int expected = 4;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void MaxSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void aboveMaxSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void MinSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void aboveMinSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void setIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.setIncreaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void MaxSetIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setIncreaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);

    }

    @Test
    public void MinSetIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setIncreaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void setDownVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(4);
        radio.setDownVolume();

        int expected = 3;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void MaxSetDownVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setDownVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void MinSetDownVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.setDownVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void aboveMinSetDownVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setDownVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected,actual);
    }
}