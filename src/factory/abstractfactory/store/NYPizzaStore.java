package factory.abstractfactory.store;

import factory.abstractfactory.NYPizzaIngredientFactory;
import factory.abstractfactory.PizzaIngredientFactory;
import factory.abstractfactory.pizza.CheesePizza;
import factory.abstractfactory.pizza.ClamPizza;
import factory.abstractfactory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        switch (type) {
            case "cheese" -> {
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
            }
            case "clam" -> {
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
            }
        }

        return pizza;
    }
}
