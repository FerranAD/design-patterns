package factory.pizzas;

public class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing veggie pizza");
    }
}
