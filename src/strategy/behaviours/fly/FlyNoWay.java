package strategy.behaviours.fly;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public String fly() {
        return "I can't fly";
    }
}
