package com.sudha.design.lld.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler {
    Person person;

    public OwnerInvocationHandler(Person person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
        try {
            if(method.getName().startsWith("setGeekRating")) {
                throw new IllegalAccessException();
            }
            else {
                return method.invoke(person, args);
            }
        } catch (InvocationTargetException _) {
        }
        return null;
    }
}
