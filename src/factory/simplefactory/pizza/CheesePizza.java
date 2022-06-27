package factory.simplefactory.pizza;

public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing cheese pizza");
    }
}
