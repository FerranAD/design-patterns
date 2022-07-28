package factory;

import factory.abstractfactory.ChicagoPizzaIngredientFactory;
import factory.abstractfactory.NYPizzaIngredientFactory;
import factory.abstractfactory.PizzaIngredientFactory;
import factory.abstractfactory.pizza.CheesePizza;
import factory.abstractfactory.pizza.ClamPizza;
import factory.abstractfactory.pizza.Pizza;
import org.junit.jupiter.api.Test;


public class AbstractFactoryTest {
    private PizzaIngredientFactory factory;
    private Pizza cheesePizza;
    private Pizza clamPizza;

    @Test
    void testChicagoPizzaIngredients() {
        factory = new ChicagoPizzaIngredientFactory();
        cheesePizza = new CheesePizza(factory);
        cheesePizza.prepare();

        clamPizza = new ClamPizza(factory);
        clamPizza.prepare();
    }

    @Test
    void testNYPizzaIngredients() {
        factory = new NYPizzaIngredientFactory();
        cheesePizza = new CheesePizza(factory);
        cheesePizza.prepare();

        clamPizza = new ClamPizza(factory);
        clamPizza.prepare();
    }
}
