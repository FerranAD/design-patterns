package simplefactory;

import simplefactory.pizza.*;

public class SimplePizzaFactory {

    // Method could be static but then inheritance could not be used to enjoy
    // multiple types of factories.
    public Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "clam" -> new ClamPizza();
            case "veggie" -> new VeggiePizza();
            default -> null;
        };
    }
}
