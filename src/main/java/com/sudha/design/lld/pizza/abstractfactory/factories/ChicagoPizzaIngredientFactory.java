package com.sudha.design.lld.pizza.abstractfactory.factories;

import com.sudha.design.lld.pizza.abstractfactory.concreteingredients.FrozenClams;
import com.sudha.design.lld.pizza.abstractfactory.concreteingredients.MozzarellaCheese;
import com.sudha.design.lld.pizza.abstractfactory.concreteingredients.PlumTomatoSauce;
import com.sudha.design.lld.pizza.abstractfactory.concreteingredients.ThickCrustDough;
import com.sudha.design.lld.pizza.abstractfactory.interfaces.Cheese;
import com.sudha.design.lld.pizza.abstractfactory.interfaces.Dough;
import com.sudha.design.lld.pizza.abstractfactory.interfaces.Sauce;
import com.sudha.design.lld.pizza.abstractfactory.interfaces.SeaFood;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public SeaFood createSeaFood() {
        return new FrozenClams();
    }
}
