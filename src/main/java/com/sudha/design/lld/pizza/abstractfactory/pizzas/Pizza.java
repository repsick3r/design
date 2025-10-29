package com.sudha.design.lld.pizza.abstractfactory.pizzas;

import com.sudha.design.lld.pizza.abstractfactory.interfaces.Cheese;
import com.sudha.design.lld.pizza.abstractfactory.interfaces.Dough;
import com.sudha.design.lld.pizza.abstractfactory.interfaces.Sauce;
import com.sudha.design.lld.pizza.abstractfactory.interfaces.SeaFood;

public abstract class Pizza {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Cheese cheese;
    public SeaFood seaFood;

    public abstract void prepare();

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

    public void setName(String name) {this.name = name;}
    public String getName() {return name;}
}
