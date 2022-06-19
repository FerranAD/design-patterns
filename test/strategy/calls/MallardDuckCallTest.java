package strategy.calls;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MallardDuckCallTest {

    @Test
    void testCall() {
        DuckCall mallardDuckCall = new MallardDuckCall();
        assertEquals("Quack!", mallardDuckCall.performCall());
    }
}