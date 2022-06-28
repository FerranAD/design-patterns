package singleton;

public class EagerInitSingletonTestThread implements Runnable {

    public EagerInitChocoBoiler instance;

    @Override
    public void run() {
        instance = EagerInitChocoBoiler.getInstance();
    }
}
