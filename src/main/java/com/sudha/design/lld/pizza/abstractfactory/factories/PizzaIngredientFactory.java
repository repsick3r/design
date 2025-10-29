package com.sudha.design.lld.pizza.abstractfactory.factories;

import com.sudha.design.lld.pizza.abstractfactory.interfaces.Cheese;
import com.sudha.design.lld.pizza.abstractfactory.interfaces.Dough;
import com.sudha.design.lld.pizza.abstractfactory.interfaces.Sauce;
import com.sudha.design.lld.pizza.abstractfactory.interfaces.SeaFood;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    SeaFood createSeaFood();
}
