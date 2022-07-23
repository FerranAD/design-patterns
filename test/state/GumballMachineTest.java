package state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GumballMachineTest {

    private GumballMachine gumballMachine;

    @BeforeEach
    void setUp() {
        gumballMachine = new GumballMachine(5);
    }

    @Test
    void gumballMachineTest() {
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.turnCrank();
    }
}