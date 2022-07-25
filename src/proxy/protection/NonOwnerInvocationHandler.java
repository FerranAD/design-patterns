package proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
    private final Person person;

    public NonOwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        if (method.getName().startsWith("set"))
            if (!method.getName().equals("setGeekRating"))
                throw new IllegalAccessException();
        return method.invoke(person, args);
    }
}
