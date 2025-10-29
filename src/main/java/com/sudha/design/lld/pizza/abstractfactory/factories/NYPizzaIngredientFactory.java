package com.sudha.design.lld.pizza.abstractfactory.factories;

import com.sudha.design.lld.pizza.abstractfactory.concreteingredients.FreshClams;
import com.sudha.design.lld.pizza.abstractfactory.concreteingredients.MarinaraSauce;
import com.sudha.design.lld.pizza.abstractfactory.concreteingredients.ReggianoCheese;
import com.sudha.design.lld.pizza.abstractfactory.concreteingredients.ThinCrustDough;
import com.sudha.design.lld.pizza.abstractfactory.interfaces.Cheese;
import com.sudha.design.lld.pizza.abstractfactory.interfaces.Dough;
import com.sudha.design.lld.pizza.abstractfactory.interfaces.Sauce;
import com.sudha.design.lld.pizza.abstractfactory.interfaces.SeaFood;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public SeaFood createSeaFood() {
        return new FreshClams();
    }
}
