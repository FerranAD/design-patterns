package combined.ducks;

import combined.observer.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
