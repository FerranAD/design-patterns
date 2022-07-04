package adapter.enumeration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Enumeration;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListEnumerationTest {
    private ArrayListWithEnumeration<String> list;

    @BeforeEach
    void setUp() {
        list = new ArrayListWithEnumeration<>();
        list.add("A");
        list.add("B");
        list.add("C");
    }

    @Test
    void testEnumerationAdapter() {
        Enumeration<String> enumeration = list.elements();
        assertEquals("A", enumeration.nextElement());
        assertEquals("B", enumeration.nextElement());
        assertEquals("C", enumeration.nextElement());
    }

}