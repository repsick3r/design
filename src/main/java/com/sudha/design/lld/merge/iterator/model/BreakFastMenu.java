package com.sudha.design.lld.merge.iterator.model;

import java.util.Iterator;

public class BreakFastMenu implements Menu {
    private final MenuItem[] items;
    static final int MAX_SIZE = 4;
    private int numberOfItems = 0;

    public BreakFastMenu() {
        items = new MenuItem[MAX_SIZE];
        addItem("Idli", "Steamed urad dal cakes", 30.50, true);
        addItem("Chicken Curry", "Andhra style chicken curry", 80.90, false);
        addItem("Dosa", "Crepes made of urad dal and rice", 40.00, true);
        addItem("Omelette", "Classic omelette with veggies and spices", 35.50, false);
    }

    public void addItem(String name, String desc, double price, boolean vegetarian){
        if(numberOfItems >= MAX_SIZE){
            System.err.println("Sorry, menu is full, can't add " + name);
        }
        else{
            MenuItem item = new MenuItem(name, desc, price, vegetarian);
            items[numberOfItems] = item;
            numberOfItems++;
        }
    }

    public Iterator createIterator() {
        return new BreakFastMenuIterator(items);
    }

}
