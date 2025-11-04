package com.sudha.design.lld.merge.composite.model;

import com.sudha.design.lld.Constants;

import java.util.Iterator;

public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void print() {
        allMenus.print(Constants.blank);
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        while(iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            try{
                if (menuComponent.isVegetarian()) menuComponent.print("");
            }
            catch (UnsupportedOperationException _) {};
        }
    }
}
