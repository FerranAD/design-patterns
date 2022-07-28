package factory;

import factory.factorymethod.pizza.Pizza;
import factory.factorymethod.store.ChicagoPizzaStore;
import factory.factorymethod.store.NYPizzaStore;
import factory.factorymethod.store.PizzaStore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryMethodTest {
    PizzaStore pizzaStore;

    @Test
    public void NYStylePizzaTest() {
        pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        assertEquals("NY Style Sauce and Cheese Pizza", pizza.getName());
    }

    @Test
    public void ChicagoStylePizzaTest() {
        pizzaStore = new ChicagoPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        assertEquals("Chicago Style Deep Dish Cheese Pizza", pizza.getName());
    }
}