package factory.simplefactory.pizza;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing pepperoni pizza");
    }
}
