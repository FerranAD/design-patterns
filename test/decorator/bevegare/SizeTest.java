package decorator.bevegare;

import decorator.beverage.Beverage;
import decorator.beverage.Espresso;
import decorator.beverage.Mocha;
import decorator.beverage.Soy;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SizeTest {
    private Beverage beverage;

    @BeforeEach
    void setUp(){
        beverage = new Espresso();
        beverage = new Soy(beverage);
    }

    @Test
    void defaultSizeTest() {
        assertEquals(Beverage.Size.TALL, beverage.getSize());
    }

    @Test
    void tallSizePriceTest() {
        assertEquals(2.09, beverage.cost());
    }

    @Test
    void grandeSizePriceTest() {
        beverage.setSize(Beverage.Size.GRANDE);
        assertEquals(2.14, beverage.cost());
    }

    @Test
    void ventiSizePriceTest() {
        beverage.setSize(Beverage.Size.VENTI);
        assertEquals(2.19, beverage.cost());
    }
}
