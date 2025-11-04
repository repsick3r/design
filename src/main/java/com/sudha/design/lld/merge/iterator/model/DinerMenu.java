package com.sudha.design.lld.merge.iterator.model;

import java.util.ArrayList;
import java.util.Iterator;

public class DinerMenu implements Menu{
    private ArrayList items;

    public DinerMenu() {
        items = new ArrayList();
        addItem("Rice", "Steamed white rice", 55.50, true);
        addItem("Chicken Curry", "Andhra style chicken curry", 80.90, false);
        addItem("Chapati", "Flat bread (wheat based)", 12.00, true);
        addItem("Omelette", "Classic omelette with veggies and spices", 30.50, false);
//        addItem("Ragi mudde", "Ragi balls", 60.70, true);
    }

    public void addItem(String name, String desc, double price, boolean vegetarian) {
        items.add(new MenuItem(name, desc, price, vegetarian));
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(items);
    }
}
