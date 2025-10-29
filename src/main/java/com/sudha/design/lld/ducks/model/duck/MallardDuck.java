package com.sudha.design.lld.ducks.model.duck;


import com.sudha.design.lld.ducks.model.fly.FlyWithWings;
import com.sudha.design.lld.ducks.model.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I am a mallard duck!");
    }

    @Override
    public void swim() {
        System.out.println("I swim little mallardy!");
    }
}
