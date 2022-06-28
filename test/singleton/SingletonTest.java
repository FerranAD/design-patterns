package singleton;

import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    void testLazyInitChocoBoiler() {
        LazyInitChocoBoiler instance1 = LazyInitChocoBoiler.getInstance();
        LazyInitChocoBoiler instance2 = LazyInitChocoBoiler.getInstance();
        assert(instance1 == instance2);
    }

    @Test
    void testEagerInitChocoBoiler() {
        EagerInitChocoBoiler instance1 = EagerInitChocoBoiler.getInstance();
        EagerInitChocoBoiler instance2 = EagerInitChocoBoiler.getInstance();
        assert(instance1 == instance2);
    }

    @Test
    void testDoubleCheckedLockingChocoBoiler() {
        DoubleCheckedLockingChocoBoiler instance1 = DoubleCheckedLockingChocoBoiler.getInstance();
        DoubleCheckedLockingChocoBoiler instance2 = DoubleCheckedLockingChocoBoiler.getInstance();
        assert(instance1 == instance2);
    }

    @Test
    void testEnumChocoBoiler() {
        EnumChocoBoiler instance1 = EnumChocoBoiler.INSTANCE;
        EnumChocoBoiler instance2 = EnumChocoBoiler.INSTANCE;
        assert(instance1 == instance2);
    }


    @Test
    void testEagerInitIsThreadSafe() {
        EagerInitSingletonTestThread tester1 = new EagerInitSingletonTestThread();
        EagerInitSingletonTestThread tester2 = new EagerInitSingletonTestThread();
        Thread thread1 = new Thread(tester1);
        Thread thread2 = new Thread(tester2);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            assert(tester1.instance == tester2.instance);
        }
    }

    @Test
    void testLazyInitIsThreadSafe() {
        LazyInitSingletonTestThread tester1 = new LazyInitSingletonTestThread();
        LazyInitSingletonTestThread tester2 = new LazyInitSingletonTestThread();
        Thread thread1 = new Thread(tester1);
        Thread thread2 = new Thread(tester2);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            assert(tester1.instance == tester2.instance);
        }
    }

    @Test
    void testDoubleCheckedLockingIsThreadSafe() {
        DoubleCheckSingletonTestThread tester1 = new DoubleCheckSingletonTestThread();
        DoubleCheckSingletonTestThread tester2 = new DoubleCheckSingletonTestThread();
        Thread thread1 = new Thread(tester1);
        Thread thread2 = new Thread(tester2);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            assert(tester1.instance == tester2.instance);
        }
    }

    @Test
    void testEnumIsThreadSafe() {
        EnumSingletonTestThread tester1 = new EnumSingletonTestThread();
        EnumSingletonTestThread tester2 = new EnumSingletonTestThread();
        Thread thread1 = new Thread(tester1);
        Thread thread2 = new Thread(tester2);
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            assert(tester1.instance == tester2.instance);
        }
    }
}