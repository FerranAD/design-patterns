package iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {
    private DinerMenu dinerMenu;
    private PancakeHouseMenu pancakeHouseMenu;
    private CafeMenu cafeMenu;

    @BeforeEach
    void setUp() {
        dinerMenu = new DinerMenu();
        pancakeHouseMenu = new PancakeHouseMenu();
        cafeMenu = new CafeMenu();
    }

    @Test
    void testMenuPrint() {
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}