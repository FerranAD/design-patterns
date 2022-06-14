package calls;

import behaviours.fly.FlyBehaviour;
import behaviours.quack.QuackBehaviour;

public abstract class DuckCall {
    QuackBehaviour quackBehaviour;

    public DuckCall() { }

    public String performCall() {
        return quackBehaviour.quack();
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
