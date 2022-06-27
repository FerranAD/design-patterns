package factory.simplefactory;

import factory.pizzas.Pizza;
import factory.simplefactory.SimplePizzaFactory;

public class SimplePizzaStore {
    SimplePizzaFactory factory;

    public SimplePizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);
        pizza.prepare();
        return pizza;
    }
}
