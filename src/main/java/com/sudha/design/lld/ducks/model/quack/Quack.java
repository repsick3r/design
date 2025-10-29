package com.sudha.design.lld.ducks.model.quack;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I am quacking!");
    }
}
