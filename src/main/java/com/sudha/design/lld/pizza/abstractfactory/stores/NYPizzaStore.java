package com.sudha.design.lld.pizza.abstractfactory.stores;


import com.sudha.design.lld.pizza.abstractfactory.factories.NYPizzaIngredientFactory;
import com.sudha.design.lld.pizza.abstractfactory.factories.PizzaIngredientFactory;
import com.sudha.design.lld.pizza.abstractfactory.pizzas.CheesePizza;
import com.sudha.design.lld.pizza.abstractfactory.pizzas.Pizza;
import com.sudha.design.lld.pizza.abstractfactory.pizzas.PlainPizza;
import com.sudha.design.lld.pizza.abstractfactory.pizzas.SeaFoodPizza;

public class NYPizzaStore extends PizzaStore {
    private final PizzaIngredientFactory pizzaIngredientFactory;

    public NYPizzaStore(){
        this.pizzaIngredientFactory = new NYPizzaIngredientFactory();
    }
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        if(type.equals("Cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("NY style cheese pizza");
        }
        else if(type.equals("SeaFood")){
            pizza = new SeaFoodPizza(pizzaIngredientFactory);
            pizza.setName("NY style seafood pizza");
        }
        else{
            pizza = new PlainPizza(pizzaIngredientFactory);
            pizza.setName("NY style plain pizza");
        }
        return pizza;
    }
}
