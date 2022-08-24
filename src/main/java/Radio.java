public class Radio {
    private int volume;
    private int numberRadio;
    private int volumePlus;
    private int volumeMinus;
    private int radioPlus;
    private int radioMinus;

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

    public int getVolumePlus() {
        return volumePlus;
    }

    public void setVolumePlusOne(int newPlusVolume) {
        if (newPlusVolume < 10) {
            newPlusVolume = newPlusVolume + 1;
        }
        if (newPlusVolume >= 10) {
            newPlusVolume = 10;
        }
        volumePlus = newPlusVolume;

    }


    public int getVolumeMinus() {
        return volumeMinus;
    }

    public void setVolumeMinusOne(int newMinusVolume) {
        if (newMinusVolume >= 0) {
            newMinusVolume = newMinusVolume - 1;
        }
        if (newMinusVolume <= 0) {
            newMinusVolume = 0;
        }
        volumeMinus = newMinusVolume;
    }


    public int getRadioPlus() {
        return radioPlus;
    }

    public void setRadioPlusOne(int newRadioPlus) {
        if (newRadioPlus <= 9) {
            newRadioPlus = newRadioPlus + 1;
        }
        if (newRadioPlus >= 10) {
            newRadioPlus = 0;
        }
        radioPlus = newRadioPlus;
    }


    public int getRadioMinus() {
        return radioMinus;
    }

    public void setRadioMinusOne(int newRadioMinus) {
        if (newRadioMinus >= 0) {
            newRadioMinus = newRadioMinus - 1;
        }
        if (newRadioMinus <= 0) {
            newRadioMinus = 9;
        }
        radioMinus = newRadioMinus;
    }
}
