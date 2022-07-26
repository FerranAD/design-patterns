package compoundpatterns;

import compoundpatterns.factory.ducks.AbstractDuckFactory;
import compoundpatterns.factory.ducks.CountingDucksFactory;
import compoundpatterns.factory.geese.AbstractGooseFactory;
import compoundpatterns.factory.geese.GooseFactory;
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