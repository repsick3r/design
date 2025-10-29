package com.sudha.design.lld.ducks.model.duck;

import com.sudha.design.lld.ducks.model.fly.FlyBehaviour;
import com.sudha.design.lld.ducks.model.quack.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    Duck(FlyBehaviour fly, QuackBehaviour quack) {
        flyBehaviour = fly;
        quackBehaviour = quack;
    }

    public abstract void display();

    public abstract void swim();

    public void doFly() {
        flyBehaviour.fly();
    }

    public void doQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
