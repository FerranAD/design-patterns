package adapter.enumeration;

import java.util.ArrayList;
import java.util.Enumeration;

public class ArrayListWithEnumeration<E> extends ArrayList<E> {
    public Enumeration<E> elements() {
        return new IteratorToEnumeration<>(this.iterator());
    }
}
