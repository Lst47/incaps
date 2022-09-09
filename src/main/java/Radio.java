public class Radio {
    private int currentStation;
    private int currentVolume;

    private int amountStation = 10;
    private int minStation = 0;
    private int maxStation = amountStation - 1;

    public Radio(int amountStation){
        this.amountStation = amountStation;
        this.maxStation = amountStation - 1;

    }
    public Radio(){
        this.amountStation = 10;
    }

    public int getMinStation(){
        return minStation;
    }
    public int getMaxStation(){
        return maxStation;
    }
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setNextStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
        } else {
            currentStation++;
        }
    }

    public void setPrevStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
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
        if (currentVolume > 100){
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;

    }


    public void setIncreaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void setDownVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}

