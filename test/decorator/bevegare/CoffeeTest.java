package decorator.bevegare;

import decorator.beverage.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoffeeTest {

    @Test
    void EspressoDescriptionTest() {
        Beverage espresso = new Espresso();
        assertEquals("Espresso", espresso.getDescription());
    }

    @Test
    void EspressoCostTest() {
        Beverage espresso = new Espresso();
        assertEquals(1.99, espresso.cost());
    }

    @Test
    void DecafDescriptionTest() {
        Beverage decaf = new Decaf();
        assertEquals("Decaf", decaf.getDescription());
    }

    @Test
    void DecafCostTest() {
        Beverage decaf = new Decaf();
        assertEquals(1.05, decaf.cost());
    }

    @Test
    void DarkRoastDescriptionTest() {
        Beverage darkRoast = new DarkRoast();
        assertEquals("Dark Roast", darkRoast.getDescription());
    }

    @Test
    void DarkRoastCostTest() {
        Beverage darkRoast = new DarkRoast();
        assertEquals(0.99, darkRoast.cost());
    }

    @Test
    void HouseBlendDescriptionTest() {
        Beverage houseBlend = new HouseBlend();
        assertEquals("House Blend", houseBlend.getDescription());
    }

    @Test
    void HouseBlendCostTest() {
        Beverage houseBlend = new HouseBlend();
        assertEquals(0.89, houseBlend.cost());
    }
}
