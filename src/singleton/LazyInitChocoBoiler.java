package singleton;

// Benefit: Thread-safe, object creation is delayed until it is needed.
// Drawback: Overhead of syncronized is paid every time getInstance() is called.
public class LazyInitChocoBoiler extends ChocoBoiler {
    private static LazyInitChocoBoiler instance;

    public static synchronized LazyInitChocoBoiler getInstance() {
        if (instance == null) {
            instance = new LazyInitChocoBoiler();
            return instance;
        }
        return instance;
    }
}
