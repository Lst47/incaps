public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            currentStation = 9;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation() {
        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void setPrevStation() {
        if (currentStation <= 0) {
            currentStation = 9;
        } else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume){
        if (currentVolume < 0 ){
            currentVolume = 0;
        }
        if (currentVolume > 10){
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;

    }


    public void setIncreaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }

    public void setDownVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}

