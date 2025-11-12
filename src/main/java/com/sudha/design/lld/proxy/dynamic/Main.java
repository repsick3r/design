package com.sudha.design.lld.proxy.dynamic;

import com.sudha.design.lld.Constants;

import java.lang.reflect.Proxy;

public class Main {
    static void main() {
        Main main = new Main();
        main.test();
    }

    private void test() {
        Person sudha = new PersonImpl("Sudhamsh", "Male", "Swimming, Tennis");
        Person owner = getOwnerProxy(sudha);
        Person nonOwner = getNonOwnerProxy(sudha);
        owner.setGender("M");
        System.out.println(owner.getGender());
        System.out.println(owner.getInterests());;
        try{
            owner.setGeekRating(10);
        }
        catch (Exception _) {
            System.out.println("cant set geek rating yourselves!");
        };
        System.out.println(Constants.marker);
        System.out.println(nonOwner.getInterests());
        nonOwner.setGeekRating(10);
        nonOwner.setGeekRating(8);
        System.out.println(nonOwner.getGeekRating());
        try{
            nonOwner.setGender("F");
        }
        catch (Exception _) {
            System.out.println("you cant change gender of someone else");
        }
        nonOwner.getGender();
    }

    private Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    private Person getNonOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }
}
