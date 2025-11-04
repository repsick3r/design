package com.sudha.design.lld.merge.iterator.model;

import java.util.ArrayList;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator {
    private final ArrayList items;
    private int counter = 0;

    public DinerMenuIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return items != null && counter < items.size();
    }

    @Override
    public MenuItem next() {
        return (MenuItem) items.get(counter++);
    }
}
