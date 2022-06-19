package decorator.beverage;

public class DarkRoast extends Beverage {
    private final Double COST_IN_EUROS = 0.99;

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public Double cost() {
        return COST_IN_EUROS;
    }
}
