package com.sudha.design.lld.merge.iterator.model;

public class MenuItem {
    String name;
    String desription;
    double price;
    boolean vegetarian;

    public MenuItem(String name, String desription, double price, boolean vegetarian) {
        this.name = name;
        this.desription = desription;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public String getDesription() {
        return desription;
    }

    public double getPrice() {
        return price;
    }

    public String getName(){
        return name;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }
}
