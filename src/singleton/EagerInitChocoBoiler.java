package singleton;

public class EagerInitChocoBoiler extends ChocoBoiler {
    private static final EagerInitChocoBoiler instance = new EagerInitChocoBoiler();

    public static EagerInitChocoBoiler getInstance() {
        return instance;
    }
}
