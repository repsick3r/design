package com.sudha.design.lld.pizza.abstractfactory.stores;


import com.sudha.design.lld.pizza.abstractfactory.pizzas.Pizza;

public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.thaw();
        pizza.toppings();
        pizza.bake();
        pizza.cut();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
