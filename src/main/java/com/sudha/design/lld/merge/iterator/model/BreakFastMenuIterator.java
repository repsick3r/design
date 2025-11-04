package com.sudha.design.lld.merge.iterator.model;

import java.util.Iterator;

public class BreakFastMenuIterator implements Iterator {
    private final MenuItem[] items;
    private int counter;

    public BreakFastMenuIterator(MenuItem[] items) {
        this.items = items;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return items != null && counter < items.length;
    }

    @Override
    public MenuItem next() {
        return items[counter++];
    }

    @Override
    public void remove() {
        if(counter <= 0) {
            throw new IllegalStateException(
                    "You cannot remove an item until you've used next()!"
            );
        }
        else {
            if(items[counter-1] != null) {
                for(int i=counter-1; i<items.length-1; i++) {
                    items[i] = items[i+1];
                }
                items[items.length-1] = null;
            }
        }
    }
}
