package com.sudha.design.lld.caffeine.beverage;

public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Putting tea bag into hot water!");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon!");
    }
}
