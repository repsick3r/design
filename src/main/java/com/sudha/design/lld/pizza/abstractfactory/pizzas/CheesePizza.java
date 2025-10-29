package com.sudha.design.lld.pizza.abstractfactory.pizzas;

import com.sudha.design.lld.pizza.abstractfactory.factories.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
    private final PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println(name + " is getting ready!");
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
