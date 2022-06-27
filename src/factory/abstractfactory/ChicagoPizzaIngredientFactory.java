package factory.abstractfactory;

import factory.abstractfactory.ingredients.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        return new Veggies[]{ new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clam createClam() {
        return new FrozenClams();
    }
}
