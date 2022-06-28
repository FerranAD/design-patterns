package singleton;

// Benefit: Thread-safe, lazy initialization, no need to synchronize.
// Drawback: Can be overkill for simple programs.
public class DoubleCheckedLockingChocoBoiler {
    private static volatile DoubleCheckedLockingChocoBoiler instance;

    public static DoubleCheckedLockingChocoBoiler getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingChocoBoiler.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingChocoBoiler();
                    return instance;
                }
            }
        }
        return instance;
    }
}
