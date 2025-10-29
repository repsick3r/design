package com.sudha.design.lld.ducks;

import com.sudha.design.lld.ducks.model.duck.Duck;
import com.sudha.design.lld.ducks.model.duck.MallardDuck;
import com.sudha.design.lld.ducks.model.duck.ModelDuck;
import com.sudha.design.lld.ducks.model.fly.FlyRocketPowered;

public class Main {
    public static void main() {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.doQuack();
        mallardDuck.doFly();
        Duck modelDuck = new ModelDuck();
        modelDuck.doQuack();
        modelDuck.doFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.doFly();
    }
}
