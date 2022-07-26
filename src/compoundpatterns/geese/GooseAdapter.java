package compoundpatterns.geese;

import compoundpatterns.ducks.Quackable;
import compoundpatterns.observer.Observable;
import compoundpatterns.observer.Observer;

public class GooseAdapter implements Quackable {
    private final Observable observable;
    private final Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
