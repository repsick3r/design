package com.sudha.design.lld.ducks.model.fly;

public class FlyRocketPowered implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("I have rocket powered flying!");
    }
}
