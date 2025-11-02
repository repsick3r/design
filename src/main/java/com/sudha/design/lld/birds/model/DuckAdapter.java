package com.sudha.design.lld.birds.model;

public class DuckAdapter implements Turkey{
    private final Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble(){
        duck.quack();
    }

    @Override
    public void fly(){
        duck.fly();
    }
}
