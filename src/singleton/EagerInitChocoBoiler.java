package singleton;

// Benefit: Thread-safe, no synchronization overhead.
// Drawback: Object creation is done at the begging of the program.
public class EagerInitChocoBoiler extends ChocoBoiler {
    private static final EagerInitChocoBoiler instance = new EagerInitChocoBoiler();

    public static EagerInitChocoBoiler getInstance() {
        return instance;
    }
}
