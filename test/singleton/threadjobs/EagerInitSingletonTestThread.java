package singleton.threadjobs;

import singleton.EagerInitChocoBoiler;

public class EagerInitSingletonTestThread implements Runnable {

    public EagerInitChocoBoiler instance;

    @Override
    public void run() {
        instance = EagerInitChocoBoiler.getInstance();
    }
}
