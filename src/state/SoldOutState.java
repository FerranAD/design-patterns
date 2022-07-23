package state;

public class SoldOutState implements State {
    GumballMachine gumballMachine;
    
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
    
    public void insertQuarter() {
        System.out.println("You can't insert a quarter, there's no gumballs!");
    }
    
    public void ejectQuarter() {
        System.out.println("There aren't any quarters to return");
    }
    
    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    @Override
    public void refill(int amount) {
        gumballMachine.setCount(amount);
        System.out.println("Gumballs refilled");
    }
}
