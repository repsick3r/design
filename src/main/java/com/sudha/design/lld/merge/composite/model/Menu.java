package com.sudha.design.lld.merge.composite.model;

import com.sudha.design.lld.Constants;

import java.util.ArrayList;
import java.util.Iterator;

public class Menu extends MenuComponent {
    private final ArrayList<MenuComponent> menuComponents;
    private final String name;
    private final String description;
    private Iterator<MenuComponent> iterator;

    public Menu(String name, String description) {
        menuComponents = new ArrayList<>();
        this.name = name;
        this.description = description;
        this.iterator = null;
    }

    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print(String indent) {
        System.out.println(Constants.space);
        System.out.println(indent + name);
        System.out.println(indent + description);
        System.out.println(Constants.space);
        indent += Constants.indent;
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print(indent);
        }
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        if(iterator == null) {
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }

}
