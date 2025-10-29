package com.sudha.design.lld.pizza.simple.model;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        return switch (type) {
            case "Veggie" -> new VeggiePizza();
            case "Cheese" -> new CheesePizza();
            case "Pepperoni" -> new PepperoniPizza();
            case null, default -> new PlainPizza();
        };
    }
}
