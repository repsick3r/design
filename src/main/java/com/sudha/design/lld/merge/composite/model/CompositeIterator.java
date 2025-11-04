package com.sudha.design.lld.merge.composite.model;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator<MenuComponent>> stack;

    public CompositeIterator(Iterator<MenuComponent> iterator) {
        stack = new Stack<>();
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty()) return false;
        else {
            Iterator<MenuComponent> iterator = stack.peek();
            if(iterator.hasNext()) return true;
            else {
                stack.pop();
                return hasNext();
            }
        }
    }

    @Override
    public MenuComponent next() {
        if(hasNext()){
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            if(component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        }
        return null;
    }
}
