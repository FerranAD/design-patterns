package iterator;

import java.util.Calendar;

public class AlternatingDinerMenuIterator {
    private MenuItem[] items;
    private int position = 0;

    public AlternatingDinerMenuIterator(MenuItem[] items) {
        this.items = items;
        Calendar calendar = Calendar.getInstance();
        position = calendar.get(Calendar.DAY_OF_WEEK) % 2;
    }

    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 2;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("You can't remove an item from a DinerMenu");
    }
}
