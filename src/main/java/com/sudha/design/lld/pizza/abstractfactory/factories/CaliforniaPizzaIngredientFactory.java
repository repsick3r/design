package com.sudha.design.lld.pizza.abstractfactory.factories;

import com.sudha.design.lld.pizza.abstractfactory.concreteingredients.BruschettaSauce;
import com.sudha.design.lld.pizza.abstractfactory.concreteingredients.Calamari;
import com.sudha.design.lld.pizza.abstractfactory.concreteingredients.GoatCheese;
import com.sudha.design.lld.pizza.abstractfactory.concreteingredients.VeryThinCrustDough;
import com.sudha.design.lld.pizza.abstractfactory.interfaces.Cheese;
import com.sudha.design.lld.pizza.abstractfactory.interfaces.Dough;
import com.sudha.design.lld.pizza.abstractfactory.interfaces.Sauce;
import com.sudha.design.lld.pizza.abstractfactory.interfaces.SeaFood;

public class CaliforniaPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new VeryThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new BruschettaSauce();
    }

    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public SeaFood createSeaFood() {
        return new Calamari();
    }
}
