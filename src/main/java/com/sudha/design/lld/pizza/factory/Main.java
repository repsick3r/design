package com.sudha.design.lld.pizza.factory;

import com.sudha.design.lld.pizza.factory.pizza.Pizza;
import com.sudha.design.lld.pizza.factory.store.ChicagoPizzaStore;
import com.sudha.design.lld.pizza.factory.store.NYPizzaStore;

public class Main {
    static void main() {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("Pepperoni");
        Pizza pizza1 = chicagoPizzaStore.orderPizza("Cheese");
    }
}
