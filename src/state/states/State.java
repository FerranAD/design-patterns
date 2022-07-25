package state.states;

import state.GumballMachine;
import state.NoCoinInsertedException;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void dispense();

    default void turnCrank() {
        System.out.println("You turned, but there's no quarter");
        throw new NoCoinInsertedException();
    }

    default void refill(int amount) {
        System.out.println("You can't refill the machine until it's sold out");
    }

    default void dispenseOneGumball(GumballMachine gumballMachine) {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
