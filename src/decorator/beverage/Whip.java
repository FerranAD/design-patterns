package decorator.beverage;

public class Whip extends CondimentDecorator {
    private final Double COST_IN_EUROS = 0.10;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        return beverage.cost() + this.COST_IN_EUROS;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
