package compoundpatterns;

import compoundpatterns.ducks.*;
import compoundpatterns.factory.ducks.AbstractDuckFactory;
import compoundpatterns.factory.geese.AbstractGooseFactory;

public class DuckSimulator {
    public void simulate(AbstractDuckFactory duckFactory, AbstractGooseFactory gooseFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = gooseFactory.createGooseDuck();

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
