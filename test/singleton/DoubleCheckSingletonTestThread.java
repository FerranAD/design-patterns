package singleton;

public class DoubleCheckSingletonTestThread implements Runnable {

    public DoubleCheckedLockingChocoBoiler instance;

    @Override
    public void run() {
        instance = DoubleCheckedLockingChocoBoiler.getInstance();
    }
}
