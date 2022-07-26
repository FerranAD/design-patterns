package compoundpatterns;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckSimulatorTest {

    private DuckSimulator simulator;

    @BeforeEach
    void setUp() {
        simulator = new DuckSimulator();
    }

    @Test
    void simulate() {
        simulator.simulate();
    }
}