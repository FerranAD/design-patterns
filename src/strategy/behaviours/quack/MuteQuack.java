package strategy.behaviours.quack;

public class MuteQuack implements QuackBehaviour {
    @Override
    public String quack() {
        return "<< Silence >>";
    }
}
