package com.sudha.design.lld.pizza.abstractfactory;

import com.sudha.design.lld.pizza.abstractfactory.pizzas.Pizza;
import com.sudha.design.lld.pizza.abstractfactory.stores.CaliforniaPizzaStore;
import com.sudha.design.lld.pizza.abstractfactory.stores.ChicagoPizzaStore;
import com.sudha.design.lld.pizza.abstractfactory.stores.NYPizzaStore;
import com.sudha.design.lld.pizza.abstractfactory.stores.PizzaStore;

public class Main {
    static void main(){
        PizzaStore store = new CaliforniaPizzaStore();
        PizzaStore store1 = new ChicagoPizzaStore();
        PizzaStore store2 = new NYPizzaStore();
        Pizza pizza = store.orderPizza("Cheese");
        Pizza pizza1 = store1.orderPizza("SeaFood");
        Pizza pizza2 = store2.orderPizza("Plain");
    }
}
