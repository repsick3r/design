package com.sudha.design.lld.coffee;

import com.sudha.design.lld.coffee.model.*;

public class Main {
    static void main(){
        Beverage b = new DarkRoast();
        System.out.println(b.getDescription() + " : " + b.cost());
        b = new Mocha(b);
        System.out.println(b.getDescription() + " : " + b.cost());

        Beverage b1 = new HouseBlend();
        System.out.println(b1.getDescription() + " : " + b1.cost());
        b1 = new Mocha(b1);
        System.out.println(b1.getDescription() + " : " + b1.cost());
        b1 = new Mocha(b1);
        System.out.println(b1.getDescription() + " : " + b1.cost());
        b1 = new Whip(b1);
        System.out.println(b1.getDescription() + " : " + b1.cost());
    }
}
