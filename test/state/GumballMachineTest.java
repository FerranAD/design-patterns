package state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GumballMachineTest {

    private GumballMachine gumballMachine;

    @BeforeEach
    void setUp() {
        gumballMachine = new GumballMachine(5, "Lleida");
    }

    @Test
    void gumballMachineQuarterGivenBackTest() {
        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
    }

    @Test
    void dispenseIsNotUnnecessarilyCalled() {
        gumballMachine.turnCrank();
    }

    @Test
    void normalFunctioningCaseTest() {
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.turnCrank();
    }

    @Test
    void refillTest() {
        GumballMachine almostEmptyGumballMachine = new GumballMachine(1, "Lleida");
        almostEmptyGumballMachine.insertQuarter();
        almostEmptyGumballMachine.turnCrank();
        almostEmptyGumballMachine.refill(2);
    }
}