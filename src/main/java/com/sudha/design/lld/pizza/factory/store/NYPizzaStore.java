package com.sudha.design.lld.pizza.factory.store;

import com.sudha.design.lld.pizza.factory.pizza.Pizza;
import com.sudha.design.lld.pizza.factory.pizza.newyork.CheesePizza;
import com.sudha.design.lld.pizza.factory.pizza.newyork.PepperoniPizza;
import com.sudha.design.lld.pizza.factory.pizza.newyork.PlainPizza;
import com.sudha.design.lld.pizza.factory.pizza.newyork.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        return switch (type) {
            case "Veggie" -> new VeggiePizza();
            case "Cheese" -> new CheesePizza();
            case "Pepperoni" -> new PepperoniPizza();
            case null, default -> new PlainPizza();
        };
    }
}
