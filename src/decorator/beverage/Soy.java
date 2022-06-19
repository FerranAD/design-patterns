package decorator.beverage;

public class Soy extends CondimentDecorator {
    private final Double TALL_COST_IN_EUROS = 0.10;
    private final Double GRANDE_COST_IN_EUROS = 0.15;
    private final Double VENTI_COST_IN_EUROS = 0.20;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        switch (this.getSize()) {
            case GRANDE -> {
                return beverage.cost() + this.GRANDE_COST_IN_EUROS;
            }
            case VENTI -> {
                return beverage.cost() + this.VENTI_COST_IN_EUROS;
            }
            default -> {
                return beverage.cost() + this.TALL_COST_IN_EUROS;
            }
        }
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}
