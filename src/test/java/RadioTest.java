import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setVolume(10 + 1);

        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMin() {
        Radio radio = new Radio();

        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioAboveMax() {
        Radio radio = new Radio();

        radio.setNumberRadio(9 + 1);

        int expected = 9;
        int actual = radio.getNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetRadioAboveMin() {
        Radio radio = new Radio();

        radio.setNumberRadio(-2);

        int expected = 0;
        int actual = radio.getNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetVolumeEqualsZero() {
        Radio radio = new Radio();

        radio.setVolume(-2);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void notSetRadioEqualsZero() {
        Radio radio = new Radio();

        radio.setNumberRadio(-1);

        int expected = 0;
        int actual = radio.getNumberRadio();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumePlusOne() {
        Radio radio = new Radio();

        radio.setVolumePlusOne(5);

        int expected = 6;
        int actual = radio.getVolumePlus();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumePlusOneMax() {
        Radio radio = new Radio();

        radio.setVolumePlusOne(11);

        int expected = 10;
        int actual = radio.getVolumePlus();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMinusOne() {
        Radio radio = new Radio();

        radio.setVolumeMinusOne(4);

        int expected = 3;
        int actual = radio.getVolumeMinus();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMinusOneLessZero() {
        Radio radio = new Radio();

        radio.setVolumeMinusOne(-2);

        int expected = 0;
        int actual = radio.getVolumeMinus();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeMinusMin() {
        Radio radio = new Radio();

        radio.setVolumeMinusOne(0);

        int expected = 0;
        int actual = radio.getVolumeMinus();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioPlusOne() {
        Radio radio = new Radio();

        radio.setRadioPlusOne(8);

        int expected = 9;
        int actual = radio.getRadioPlus();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioPlusOneMax() {
        Radio radio = new Radio();

        radio.setRadioPlusOne(9);

        int expected = 0;
        int actual = radio.getRadioPlus();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void radioMinusOne() {
        Radio radio = new Radio();

        radio.setRadioMinusOne(5);

        int expected = 4;
        int actual = radio.getRadioMinus();

        Assertions.assertEquals(expected, actual);
    }





    @Test
    public void radioMinusOneMin() {
        Radio radio = new Radio();

        radio.setRadioMinusOne(0);

        int expected = 9;
        int actual = radio.getRadioMinus();

        Assertions.assertEquals(expected, actual);
    }
}
