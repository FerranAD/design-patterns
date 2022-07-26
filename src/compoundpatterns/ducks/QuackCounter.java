package compoundpatterns.ducks;

import compoundpatterns.observer.Observer;

public class QuackCounter implements Quackable {
    private final Quackable quacker;
    private static int quacks;

    public QuackCounter(Quackable quacker) {
        this.quacker = quacker;
        quacks = 0;
    }


    @Override
    public void quack() {
        quacker.quack();
        quacks++;
    }

    public static int getQuacks() {
        return QuackCounter.quacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        quacker.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quacker.notifyObservers();
    }
}
