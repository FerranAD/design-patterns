package strategy.calls;

import strategy.behaviours.quack.QuackBehaviour;

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
