package decorator.beverage;

public class Espresso extends Beverage {
    private final Double COST_IN_EUROS = 1.99;

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public Double cost() {
        return COST_IN_EUROS;
    }
}
