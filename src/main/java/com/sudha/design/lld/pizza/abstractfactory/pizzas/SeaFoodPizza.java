package com.sudha.design.lld.pizza.abstractfactory.pizzas;

import com.sudha.design.lld.pizza.abstractfactory.factories.PizzaIngredientFactory;

public class SeaFoodPizza extends Pizza{
    private final PizzaIngredientFactory pizzaIngredientFactory;

    public SeaFoodPizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println(name + " is getting whipped up!");
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        seaFood = pizzaIngredientFactory.createSeaFood();
    }
}
