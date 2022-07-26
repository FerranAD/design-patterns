package compoundpatterns.observer;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
