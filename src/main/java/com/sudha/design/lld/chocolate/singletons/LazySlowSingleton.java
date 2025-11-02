package com.sudha.design.lld.chocolate.singletons;

public class LazySlowSingleton {
    private static LazySlowSingleton instance;

    private LazySlowSingleton(){}

    public static synchronized LazySlowSingleton getInstance() {
        if(instance == null){
            System.out.println("Creating new instance!");
            instance = new LazySlowSingleton();
        }
        return instance;
    }
}
