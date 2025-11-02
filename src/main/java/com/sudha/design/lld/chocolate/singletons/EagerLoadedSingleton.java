package com.sudha.design.lld.chocolate.singletons;

public class EagerLoadedSingleton {
    private static final EagerLoadedSingleton instance = new EagerLoadedSingleton();

    private EagerLoadedSingleton(){}

    public static EagerLoadedSingleton getInstance() {
        System.out.println("Already created the instance!");
        return instance;
    }
}
