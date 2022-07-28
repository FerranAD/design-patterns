package singleton.threadjobs;

import singleton.DoubleCheckedLockingChocoBoiler;

public class DoubleCheckSingletonTestThread implements Runnable {

    public DoubleCheckedLockingChocoBoiler instance;

    @Override
    public void run() {
        instance = DoubleCheckedLockingChocoBoiler.getInstance();
    }
}
