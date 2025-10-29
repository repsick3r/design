package com.sudha.design.lld.coffee.model;

public class Mocha extends CondimentDecorator{
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription(){
        return beverage.getDescription() + " , Mocha";
    }

    @Override
    public double cost(){
        return beverage.cost() + 0.9;
    }
}
