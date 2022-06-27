package factory.factorymethod.store;

import factory.factorymethod.pizza.ChicagoStyleCheesePizza;
import factory.factorymethod.pizza.ChicagoStyleVeggiePizza;
import factory.factorymethod.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            default -> null;
        };
    }
}
