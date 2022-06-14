package animals;

import behaviours.fly.FlyNoWay;
import behaviours.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public String display() {
        return "I'm a model duck!";
    }
}
