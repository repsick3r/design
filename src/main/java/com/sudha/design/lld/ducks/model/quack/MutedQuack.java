package com.sudha.design.lld.ducks.model.quack;

public class MutedQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I can't quack!");
    }
}
