package decorator.beverage;

public class Decaf extends Beverage {
    private final Double COST_IN_EUROS = 1.05;

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public Double cost() {
        return COST_IN_EUROS;
    }
}
