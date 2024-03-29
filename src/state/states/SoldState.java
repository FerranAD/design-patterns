package state.states;

import state.GumballMachine;

public class SoldState implements State {
    GumballMachine gumballMachine;
    
    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }
    
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
    
    public void dispense() {
        dispenseOneGumball(gumballMachine);
    }

    @Override
    public String toString() {
        return "Sold";
    }
}
