package com.sudha.design.lld.pizza.factory.pizza;

public abstract class Pizza {
    public String name;

    public void say() {
        System.out.println(name + " is getting ready!");
    }
    public void thaw() {
        System.out.println("Removed from freezer!");
    }

    public void toppings() {
        System.out.println("Adding the choicest toppings!");
    }
    public void bake() {
        System.out.println("Gone into the oven!");
    }

    public void cut() {
        System.out.println("Cutting into slices!");
    }
}
