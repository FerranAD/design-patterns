package compoundpatterns.ducks;

import compoundpatterns.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
