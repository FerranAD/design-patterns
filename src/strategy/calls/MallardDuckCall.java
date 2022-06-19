package strategy.calls;

import strategy.behaviours.quack.Quack;

public class MallardDuckCall extends DuckCall {
    public MallardDuckCall() {
        quackBehaviour = new Quack();
    }
}
