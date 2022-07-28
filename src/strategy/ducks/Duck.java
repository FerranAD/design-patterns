package strategy.ducks;

import strategy.behaviours.fly.FlyBehaviour;
import strategy.behaviours.quack.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck() { }

    public String performFly() {
        return flyBehaviour.fly();
    }

    public String performQuack() {
        return quackBehaviour.quack();
    }

    public String swim() {
        return "All ducks float, even decoys!";
    }

    public abstract String display();

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
