package com.sudha.design.lld.pizza.abstractfactory.pizzas;

import com.sudha.design.lld.pizza.abstractfactory.factories.PizzaIngredientFactory;

public class PlainPizza extends Pizza {
    private final PizzaIngredientFactory pizzaIngredientFactory;

    public PlainPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println(name + " is getting ready!");
        dough = pizzaIngredientFactory.createDough();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
