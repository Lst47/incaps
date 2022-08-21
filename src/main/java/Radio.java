public class Radio {
    private int volume;

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

    private int numberRadio;

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

    private int volumePlus;

    public int getVolumePlus(){
        return volumePlus;
    }
    public void setVolumePlusOne(int newPlusVolume) {
        if (newPlusVolume < 10) {
            newPlusVolume = newPlusVolume + 1;
            }
        if (newPlusVolume >= 10){
            newPlusVolume = 10;
        }
        volumePlus = newPlusVolume;

    }

    private int volumeMinus;
    public int getVolumeMinus(){
        return volumeMinus;
    }
    public void setVolumeMinusOne(int newMinusVolume) {
        if (newMinusVolume >= 0) {
            newMinusVolume = newMinusVolume - 1;
        }
        if (newMinusVolume <= 0){
            newMinusVolume = 0;
        }
        volumeMinus = newMinusVolume;
    }

    private int radioPlus;

    public int getRadioPlus(){
        return radioPlus;
    }
    public void setRadioPlusOne(int newRadioPlus){
        if (newRadioPlus < 9){
            newRadioPlus = newRadioPlus + 1;
        }
        if (newRadioPlus >= 9){
            newRadioPlus = 9;
        }
        radioPlus = newRadioPlus;
    }

    private int radioMinus;

    public int getRadioMinus(){
        return radioMinus;
    }
    public void setRadioMinusOne(int newRadioMinus){
        if (newRadioMinus >= 0){
            newRadioMinus = newRadioMinus - 1;
        }
        if (newRadioMinus <= 0){
            newRadioMinus = 0;
        }
        radioMinus = newRadioMinus;
    }
}
