package com.sudha.design.lld.pizza.simple;

import com.sudha.design.lld.pizza.simple.model.PepperoniPizza;
import com.sudha.design.lld.pizza.simple.model.Pizza;
import com.sudha.design.lld.pizza.simple.model.PizzaStore;
import com.sudha.design.lld.pizza.simple.model.SimplePizzaFactory;

public class Main {
    static void main(){
        SimplePizzaFactory factory = new SimplePizzaFactory();
        PizzaStore store = new PizzaStore(factory);
        Pizza pizza = store.orderPizza("Pepperoni");
        if(pizza instanceof PepperoniPizza) {
            System.out.println("All good!");
        }
    }
}
