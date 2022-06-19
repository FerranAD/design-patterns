package decorator.beverage;

public class SteamedMilk extends CondimentDecorator {
    private final Double COST_IN_EUROS = 0.10;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        return beverage.cost() + this.COST_IN_EUROS;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Steamed Milk";
    }
}
