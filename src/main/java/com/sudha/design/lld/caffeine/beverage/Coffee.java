package com.sudha.design.lld.caffeine.beverage;

import java.util.Objects;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Pouring hot water through coffee filter!");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk!");
    }

    @Override
    boolean customerWantCondiments(){
        String input = getUserInput();
        return !Objects.equals(input, "n");
    }
}
