package singleton;

public class LazyInitChocoBoiler extends ChocoBoiler {
    private static LazyInitChocoBoiler instance;

    public static LazyInitChocoBoiler getInstance() {
        if (instance == null) {
            instance = new LazyInitChocoBoiler();
            return instance;
        }
        return instance;
    }
}
