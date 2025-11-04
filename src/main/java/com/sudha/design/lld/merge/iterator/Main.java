package com.sudha.design.lld.merge.iterator;

import com.sudha.design.lld.Constants;
import com.sudha.design.lld.merge.iterator.model.BreakFastMenu;
import com.sudha.design.lld.merge.iterator.model.DinerMenu;
import com.sudha.design.lld.merge.iterator.model.MenuItem;

import java.util.Iterator;

public class Main {
    public static void main() {
        DinerMenu dinerMenu = new DinerMenu();
        BreakFastMenu breakFastMenu = new BreakFastMenu();
        breakFastMenu.addItem("Poori", "Deep fried flour shell", 50.70, true);
        print(breakFastMenu.createIterator());
        System.out.println(Constants.marker);
        print(dinerMenu.createIterator());
    }

    private static void print(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem item = (MenuItem) iterator.next();
            System.out.println(item.getName() + Constants.space.substring(0, Constants.space.length()-item.getName().length()) + item.getPrice());
            System.out.println(item.getDesription().toLowerCase());
            System.out.println(Constants.space);
        }
    }
}
