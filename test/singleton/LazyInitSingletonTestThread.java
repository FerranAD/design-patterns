package singleton;

public class LazyInitSingletonTestThread implements Runnable {

    public LazyInitChocoBoiler instance;

    @Override
    public void run() {
        instance = LazyInitChocoBoiler.getInstance();
    }
}
