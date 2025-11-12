package com.sudha.design.lld.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NonOwnerInvocationHandler implements InvocationHandler {
    Person person;

    public NonOwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if(method.getName().startsWith("setGeekRating") || method.getName().startsWith("get")) {
                return method.invoke(person, args);
            }
            else {
                throw new IllegalAccessException();
            }
        }
        catch (InvocationTargetException _) {}
        return null;
    }
}
