package combined.ducks;

import combined.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    private final List<Quackable> quackers = new ArrayList<>();

    public void add(Quackable quacker) { quackers.add(quacker); }

    @Override
    public void quack() {
        for (var quacker: quackers) { quacker.quack(); }
    }

    @Override
    public void registerObserver(Observer observer) {
        quackers.forEach(quacker -> quacker.registerObserver(observer));
    }

    @Override
    public void notifyObservers() { }
}
