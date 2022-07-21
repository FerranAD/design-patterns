package factory.factorymethod.store;


import factory.factorymethod.pizza.NYStyleCheesePizza;
import factory.factorymethod.pizza.NYStyleVeggiePizza;
import factory.factorymethod.pizza.Pizza;

import java.awt.*;
import java.util.LinkedList;
import java.util.ListIterator;

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
