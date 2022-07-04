package adapter.enumeration;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorToEnumeration<E> implements Enumeration<E> {
    private final Iterator<E> iter;

    public IteratorToEnumeration(Iterator<E> iter) {
        this.iter = iter;
    }

    @Override
    public boolean hasMoreElements() {
        return iter.hasNext();
    }

    @Override
    public E nextElement() {
        return iter.next();
    }
}
