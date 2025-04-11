public class Radio {
    private String currentRadioStation;
    private boolean isRadioOn;
    private int volume;

    public Radio(String station, int volume){
        currentRadioStation = station;
        this.volume = volume;
        isRadioOn = true;
    }
    public void setCurrentRadioStation(String station) { this.currentRadioStation = station; }

    public String getCurrentRadioStation () { return this.currentRadioStation; }

    public void turnRadioOn() {
        isRadioOn = true;
        System.out.println("Radio was turned on");
    }

    public void turnRadioOff() {
        isRadioOn = false;
        System.out.println("Radio was turned off");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
