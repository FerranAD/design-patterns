package state;

public class WinnerState implements State {
    GumballMachine gumballMachine;
    
    public WinnerState(GumballMachine gumballMachine) {
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
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            System.out.println("You are a winner! You get two gumballs for your quarter");
            dispenseOneGumball(gumballMachine);
        }
    }
}
