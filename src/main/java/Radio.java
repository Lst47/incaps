public class Radio {
    public int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 10) {
            newVolume = newVolume + 1;
        }
        if (newVolume > 10) {
            newVolume = 10;
        }
        if (newVolume < 0) {
            newVolume = 0;
        }
        volume = newVolume;
    }

    public int numberRadio;

    public int getNumberRadio() {
        return numberRadio;
    }

    public void setNumberRadio(int newNumberRadio) {
        if (newNumberRadio < 9) {
            newNumberRadio = newNumberRadio + 1;
        }
        if (newNumberRadio > 9) {
            newNumberRadio = 9;
        }
        if (newNumberRadio < 0) {
            newNumberRadio = 0;
        }
        numberRadio = newNumberRadio;
    }
}
