package facade.hometheater.subsystem;

public class TheaterLights {
    public void on() {
        System.out.println("TheaterLights on");
    }

    public void off() {
        System.out.println("TheaterLights off");
    }

    public void dim(int level) {
        System.out.println("TheaterLights dimming to " + level);
    }
}
