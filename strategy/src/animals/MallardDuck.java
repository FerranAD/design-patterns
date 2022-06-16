package animals;

import behaviours.fly.FlyWithWings;
import behaviours.quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public String display() {
        return "I'm a real Mallard duck";
    }
}
