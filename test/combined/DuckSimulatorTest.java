package combined;

import combined.factory.ducks.AbstractDuckFactory;
import combined.factory.ducks.CountingDucksFactory;
import combined.factory.geese.AbstractGooseFactory;
import combined.factory.geese.GooseFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DuckSimulatorTest {

    private DuckSimulator simulator;
    private AbstractDuckFactory duckFactory;
    private AbstractGooseFactory gooseFactory;

    @BeforeEach
    void setUp() {
        simulator = new DuckSimulator();
        duckFactory = new CountingDucksFactory();
        gooseFactory = new GooseFactory();
    }

    @Test
    void simulate() {
        simulator.simulate(duckFactory, gooseFactory);
    }
}