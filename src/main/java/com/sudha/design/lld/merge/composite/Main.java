package com.sudha.design.lld.merge.composite;

import com.sudha.design.lld.Constants;
import com.sudha.design.lld.merge.composite.model.Menu;
import com.sudha.design.lld.merge.composite.model.MenuComponent;
import com.sudha.design.lld.merge.composite.model.MenuItem;
import com.sudha.design.lld.merge.composite.model.Waitress;

public class Main {
    static void main() {
        MenuComponent tiffins = new Menu("Breakfast Menu", "Raju tiffins");
        MenuComponent diner = new Menu("Dinner Menu", "Swami meals");
        MenuComponent desert = new Menu("Desert Menu", "Monkey stone ice creams");
        MenuComponent all = new Menu("Food Court Menu", "Sudha food court");
        all.add(tiffins);
        all.add(diner);

        tiffins.add(new MenuItem("Idli", "Steamed urad dal cakes", 30.50, true));
        tiffins.add(new MenuItem("Chicken Curry", "Andhra style chicken curry", 80.90, false));
        tiffins.add(new MenuItem("Dosa", "Crepes made of urad dal and rice", 40.00, true));
        tiffins.add(new MenuItem("Omelette", "Classic omelette with veggies and spices", 35.50, false));

        diner.add(new MenuItem("Rice", "Steamed white rice", 55.50, true));
        diner.add(new MenuItem("Chicken Curry", "Andhra style chicken curry", 80.90, false));
        diner.add(new MenuItem("Chapati", "Flat bread (wheat based)", 12.00, true));
        diner.add(new MenuItem("Omelette", "Classic omelette with veggies and spices", 30.50, false));

        diner.add(desert);

        desert.add(new MenuItem("Butterscotch cone", "Premium butterscotch on vanilla cone", 40, true));
        desert.add(new MenuItem("Vanilla cone", "Original vanilla on biscoff cone", 40, true));
        desert.add(new MenuItem("Hazelnut cone", "Chunky hazelnuts on chocolate cone", 60, true));

        Waitress waitress = new Waitress(all);

        waitress.print();
        System.out.println(Constants.marker);
        waitress.printVegetarianMenu();
    }
}
