package proxy.protection;

import javax.naming.NoPermissionException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
    private final Person person;

    public OwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("setGeekRating"))
            throw new IllegalAccessException();
        return method.invoke(person, args);
    }
}
