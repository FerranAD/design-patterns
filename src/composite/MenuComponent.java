package composite;

public abstract class MenuComponent {
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("You can't add to a MenuComponent");
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("You can't remove from a MenuComponent");
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException("You can't get a child from a MenuComponent");
    }
    public String getName() {
        throw new UnsupportedOperationException("You can't get the name of a MenuComponent");
    }
    public String getDescription() {
        throw new UnsupportedOperationException("You can't get the description of a MenuComponent");
    }
    public double getPrice() {
        throw new UnsupportedOperationException("You can't get the price of a MenuComponent");
    }
    public boolean isVegetarian() {
        throw new UnsupportedOperationException("You can't get the vegetarian status of a MenuComponent");
    }
    public void print() {
        throw new UnsupportedOperationException("You can't print a MenuComponent");
    }
}
