package compoundpatterns;

import compoundpatterns.ducks.*;
import compoundpatterns.factory.ducks.AbstractDuckFactory;
import compoundpatterns.factory.geese.AbstractGooseFactory;

public class DuckSimulator {
    public void simulate(AbstractDuckFactory duckFactory, AbstractGooseFactory gooseFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = gooseFactory.createGooseDuck();

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallards = new Flock();

        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();

        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);

        flockOfDucks.add(flockOfMallards);

        System.out.println("\nWhole flock simulation");
        simulate(flockOfDucks);

        System.out.println("\nMallard Flock simulation");
        simulate(flockOfMallards);

        System.out.println("\nThe ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
