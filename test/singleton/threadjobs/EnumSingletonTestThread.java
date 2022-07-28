package singleton.threadjobs;

import singleton.EnumChocoBoiler;

public class EnumSingletonTestThread implements Runnable {

    public EnumChocoBoiler instance;

    @Override
    public void run() {
        instance = EnumChocoBoiler.INSTANCE;
    }
}
