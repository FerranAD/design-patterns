package factory.pizzas;

public class ClamPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing clam pizza");
    }
}
