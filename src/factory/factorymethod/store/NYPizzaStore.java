package factory.factorymethod.store;


import factory.factorymethod.pizza.NYStyleCheesePizza;
import factory.factorymethod.pizza.NYStyleVeggiePizza;
import factory.factorymethod.pizza.Pizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            case "veggie" -> new NYStyleVeggiePizza();
            default -> null;
        };
    }
}
