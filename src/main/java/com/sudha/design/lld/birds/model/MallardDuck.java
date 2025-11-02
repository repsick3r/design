package com.sudha.design.lld.birds.model;

public class MallardDuck implements Duck{
    @Override
    public void quack() {
        System.out.println("I am quacking!");
    }

    @Override
    public void fly() {
        System.out.println("I am flying!");
    }
}
