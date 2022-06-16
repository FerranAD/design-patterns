import animals.Duck;
import animals.MallardDuck;
import animals.ModelDuck;
import behaviours.fly.FlyRocketPowered;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MallardDuckTest {

    @Test
    void testFly() {
        Duck mallardDuck = new MallardDuck();
        assertEquals("I'm flying!", mallardDuck.performFly());
    }

    @Test
    void testQuack() {
        Duck mallardDuck = new MallardDuck();
        assertEquals("Quack!", mallardDuck.performQuack());
    }

    @Test
    void testFlyBehaviourChange() {
        Duck modelDuck = new ModelDuck();
        assertEquals("I can't fly", modelDuck.performFly());
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        assertEquals("I'm flying with a rocket!", modelDuck.performFly());
    }
}