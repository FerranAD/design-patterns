package factory.pizzas;

public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing pepperoni pizza");
    }
}
