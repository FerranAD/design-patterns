package combined.observer;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
