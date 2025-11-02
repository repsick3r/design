package com.sudha.design.lld.caffeine;

import com.sudha.design.lld.Constants;
import com.sudha.design.lld.caffeine.beverage.CaffeineBeverage;
import com.sudha.design.lld.caffeine.beverage.Coffee;
import com.sudha.design.lld.caffeine.beverage.MyFrame;
import com.sudha.design.lld.caffeine.beverage.Tea;

import java.util.Arrays;

public class Main {
    static void main(){
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();
        coffee.prepareDrink();
        System.out.println(Constants.marker);
        tea.prepareDrink();
        System.out.println(Constants.marker);
        coffee.prepareDrink();
        System.out.println(Constants.marker);
        System.out.println(Constants.marker);
        Duck[] ducks = {new Duck("lali", 6), new Duck("vinay", 7),
                new Duck("latha", 3), new Duck("sudha", 5)};
        display(ducks);
        Arrays.sort(ducks);
        System.out.println(Constants.marker);
        display(ducks);
        System.out.println(Constants.marker);
        MyFrame.main();
    }

    private static void display(Duck[] ducks){
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
