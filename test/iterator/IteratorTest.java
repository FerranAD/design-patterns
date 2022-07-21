package iterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {
    private DinerMenu dinerMenu;
    private PancakeHouseMenu pancakeHouseMenu;

    @BeforeEach
    void setUp() {
        dinerMenu = new DinerMenu();
        pancakeHouseMenu = new PancakeHouseMenu();
    }

    @Test
    void testMenuPrint() {
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}