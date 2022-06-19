package decorator.beverage;

public abstract class Beverage {
    protected String description = "Unkown beverage";
    public enum Size {TALL, GRANDE, VENTI}
    private Size size = Size.TALL;

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }


    public String getDescription () {
        return description;
    }

    public abstract Double cost();

}
