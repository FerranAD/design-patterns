package simplefactory.pizza;

public class VeggiePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing veggie pizza");
    }
}
