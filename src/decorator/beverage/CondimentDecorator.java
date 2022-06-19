package decorator.beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public abstract String getDescription();

    public Size getSize() {
        return super.getSize();
    }
}
