package com.sudha.design.lld.merge.composite.model;

import com.sudha.design.lld.Constants;

import java.util.Iterator;

public class MenuItem extends MenuComponent{
    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }

    private String name;
    private String description;
    private double price;
    private boolean vegetarian;

    public MenuItem(String name, String description, double price, boolean vegetarian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void print(String indent) {
        System.out.println(indent + name + Constants.huge_space.substring(name.length()+indent.length()) + price);
        System.out.println(indent + description + Constants.huge_space.substring(description.length()+indent.length()) +
                (vegetarian ? "V" : "NV"));
    }
}
