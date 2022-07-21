package iterator;

import java.util.ArrayList;

public class PancakeHouseIterator implements Iterator {
    private ArrayList<MenuItem> menuItems;
    private int position = 0;

    public PancakeHouseIterator(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public MenuItem next() {
        MenuItem currentItem = menuItems.get(position);
        position++;
        return currentItem;
    }

    public boolean hasNext() {
        return position < menuItems.size();
    }
}
