package com.sudha.design.lld.pizza.factory.store;

import com.sudha.design.lld.pizza.factory.pizza.Pizza;
import com.sudha.design.lld.pizza.factory.pizza.chicago.CheesePizza;
import com.sudha.design.lld.pizza.factory.pizza.chicago.PepperoniPizza;
import com.sudha.design.lld.pizza.factory.pizza.chicago.PlainPizza;
import com.sudha.design.lld.pizza.factory.pizza.chicago.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {
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
