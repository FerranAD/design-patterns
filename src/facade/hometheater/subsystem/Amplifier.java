package facade.hometheater.subsystem;

public class Amplifier {
    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;
    private int volume;

    public void on() {
        System.out.println("Amplifier on");
    }

    public void off() {
        System.out.println("Amplifier off");
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvdPlayer = dvd;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setSurroundSound() {
        System.out.println("Surround sound on");
    }

    public void setCd(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }
}
