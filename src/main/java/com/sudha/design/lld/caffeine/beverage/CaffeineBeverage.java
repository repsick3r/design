package com.sudha.design.lld.caffeine.beverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class CaffeineBeverage {
    public final void prepareDrink() {
        boil();
        brew();
        pourInACup();
        if(customerWantCondiments()) addCondiments();
    }

    void boil() {
        System.out.println("Boiling water!");
    }

    void pourInACup() {
        System.out.println("Pouring in a cup!");
    }

    abstract void brew();
    abstract void addCondiments();

    //hook, provides default or no implementation, subclasses are free to override this.
    boolean customerWantCondiments(){
        return true;
    }

    String getUserInput(){
        String answer = null;
        System.out.println("Would you like condiments with the beverage (y/n)? ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(answer == null) return "n";
        return answer;
    }
}
