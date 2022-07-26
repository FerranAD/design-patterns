package compoundpatterns;

import compoundpatterns.factory.AbstractDuckFactory;
import compoundpatterns.factory.CountingDucksFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckSimulatorTest {

    private DuckSimulator simulator;
    private AbstractDuckFactory duckFactory;

    @BeforeEach
    void setUp() {
        simulator = new DuckSimulator();
        duckFactory = new CountingDucksFactory();
    }

    @Test
    void simulate() {
        simulator.simulate(duckFactory);
    }
}