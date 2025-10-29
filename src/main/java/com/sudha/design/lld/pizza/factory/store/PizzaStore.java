package com.sudha.design.lld.pizza.factory.store;


import com.sudha.design.lld.pizza.factory.pizza.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.say();
        pizza.thaw();
        pizza.toppings();
        pizza.bake();
        pizza.cut();
        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
