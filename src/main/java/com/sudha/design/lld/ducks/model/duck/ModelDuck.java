package com.sudha.design.lld.ducks.model.duck;

import com.sudha.design.lld.ducks.model.fly.NoFly;
import com.sudha.design.lld.ducks.model.quack.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super(new NoFly(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I am a model duck!");
    }

    @Override
    public void swim() {
        System.out.println("I cannot swim!");
    }
}
