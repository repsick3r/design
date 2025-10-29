package com.sudha.design.lld.pizza.simple.model;

public class PizzaStore {
    private final SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public Pizza orderPizza(String type){
        Pizza pizza = simplePizzaFactory.createPizza(type);
        pizza.say();
        pizza.thaw();
        pizza.toppings();
        pizza.bake();
        pizza.cut();
        return pizza;
    }
}
