package proxy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import state.GumballMachine;

import static org.junit.jupiter.api.Assertions.*;

class GumballMonitorTest {

    private GumballMonitor monitor;
    private GumballMachine machine;

    @BeforeEach
    void setUp() {
        machine = new GumballMachine(5, "Lleida");
        monitor = new GumballMonitor(machine);
    }

    @Test
    void monitorTest() {
        monitor.report();
        machine.insertQuarter();
        monitor.report();
    }

}