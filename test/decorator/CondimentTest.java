package decorator;

import decorator.beverage.Beverage;
import decorator.beverage.CondimentDecorator;
import decorator.beverage.Espresso;
import decorator.beverage.Mocha;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CondimentTest {
    private Beverage beverage;

    @BeforeEach
    void setUp() {
        beverage = new Espresso();
    }

    @Test
    void testMochaDescription() {
        beverage = new Mocha(beverage);
        assertEquals("Espresso, Mocha", beverage.getDescription());
    }

    @Test
    void testMochCost(){
        beverage = new Mocha(beverage);
        assertEquals(2.19, beverage.cost());
    }

    @Test
    void doubleMochaTest() {
        beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        assertEquals(2.39, beverage.cost());
        assertEquals("Espresso, Mocha, Mocha", beverage.getDescription());
    }
}
