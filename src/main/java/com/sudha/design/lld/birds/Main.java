package com.sudha.design.lld.birds;

import com.sudha.design.lld.birds.model.*;

public class Main {
    static void main() {
        Duck mallard = new MallardDuck();
        Turkey wildTurkey = new WildTurkey();
        Duck turkeyDuck = new TurkeyAdapter(wildTurkey);

        mallard.quack();
        mallard.fly();

        wildTurkey.gobble();
        wildTurkey.fly();

        turkeyDuck.quack();
        turkeyDuck.fly();

        Turkey duckTurkey = new DuckAdapter(mallard);

        duckTurkey.gobble();
        duckTurkey.fly();
    }
}
