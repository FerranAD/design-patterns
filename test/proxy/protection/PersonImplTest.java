package proxy.protection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import static org.junit.jupiter.api.Assertions.assertThrows;

class PersonImplTest {
    private Person person = new PersonImpl();

    Person getProxy(Person person, InvocationHandler handler) {
        return (Person) Proxy.newProxyInstance(
                person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                handler
        );
    }

    @BeforeEach
    void setUp() throws Throwable {
        person.setName("John");
        person.setGender("M");
        person.setInterests("Java");
        person.setGeekRating(10);
    }

    @Test
    void testRatingYourself() {
        Person person = getProxy(this.person, new OwnerInvocationHandler(this.person));
        assertThrows(IllegalAccessException.class, () -> person.setGeekRating(10));
    }

    @Test
    void testSettingsOthersName() {
        Person person = getProxy(this.person, new NonOwnerInvocationHandler(this.person));
        assertThrows(IllegalAccessException.class, () -> person.setName("John"));
    }

    @Test
    void testRatingAngConsultingOthers() throws Throwable {
        Person person = getProxy(this.person, new NonOwnerInvocationHandler(this.person));
        person.setGeekRating(7);
        person.getGender();
        person.getInterests();
        person.getName();
    }

    @Test
    void testConsultingAndEditingOwner() throws Throwable {
        Person person = getProxy(this.person, new OwnerInvocationHandler(this.person));
        person.getName();
        person.getGender();
        person.getInterests();
        person.getGeekRating();
        person.setName("John");
        person.setGender("M");
        person.setInterests("Java");
    }


}