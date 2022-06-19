package decorator.beverage;

public class HouseBlend extends Beverage {
    private final Double COST_IN_EUROS = 0.89;

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public Double cost() {
        return COST_IN_EUROS;
    }
}
