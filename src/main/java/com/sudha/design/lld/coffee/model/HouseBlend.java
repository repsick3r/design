package com.sudha.design.lld.coffee.model;

public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 1.1;
    }
}
