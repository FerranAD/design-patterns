package templatemethod.withhooks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import templatemethod.CaffeineBeverage;

import static org.junit.jupiter.api.Assertions.*;

class CaffeineBeverageWithHooksTest {

    private CaffeineBeverageWithHooks coffeeBeverage;
    private CaffeineBeverageWithHooks teaBeverage;

    @BeforeEach
    void setUp() {
        coffeeBeverage = new CoffeeHooks();
        teaBeverage = new TeaHooks();
    }

    @Test
    void testCoffeeBeverage() {
        coffeeBeverage.prepareRecipe();
    }

    @Test
    void testTeaBeverage() {
        teaBeverage.prepareRecipe();
    }
}