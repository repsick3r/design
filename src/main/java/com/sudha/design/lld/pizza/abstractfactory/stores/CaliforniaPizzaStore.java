package com.sudha.design.lld.pizza.abstractfactory.stores;

import com.sudha.design.lld.pizza.abstractfactory.factories.CaliforniaPizzaIngredientFactory;
import com.sudha.design.lld.pizza.abstractfactory.factories.PizzaIngredientFactory;
import com.sudha.design.lld.pizza.abstractfactory.pizzas.CheesePizza;
import com.sudha.design.lld.pizza.abstractfactory.pizzas.Pizza;
import com.sudha.design.lld.pizza.abstractfactory.pizzas.PlainPizza;
import com.sudha.design.lld.pizza.abstractfactory.pizzas.SeaFoodPizza;

public class CaliforniaPizzaStore extends PizzaStore {
    private final PizzaIngredientFactory pizzaIngredientFactory;

    public CaliforniaPizzaStore() {
        this.pizzaIngredientFactory = new CaliforniaPizzaIngredientFactory();
    }

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if(type.equals("Cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Cali style cheese pizza");
        }
        else if(type.equals("SeaFood")){
            pizza = new SeaFoodPizza(pizzaIngredientFactory);
            pizza.setName("Cali style seafood pizza");
        }
        else{
            pizza = new PlainPizza(pizzaIngredientFactory);
            pizza.setName("Cali style plain pizza");
        }
        return pizza;
    }
}
