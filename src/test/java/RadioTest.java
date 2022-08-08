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
}
