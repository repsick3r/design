package com.sudha.design.lld.gumball.model;

public abstract class State {

    void insertCoin(Machine machine) {
        System.out.println("Invalid operation!");
    }

    void ejectCoin(Machine machine) {
        System.out.println("Invalid operation!");
    }

    boolean turnCrank(Machine machine) {
        System.out.println("Invalid operation!");
        return false;
    }

    void dispense(Machine machine) {
        System.out.println("Invalid operation!");
    }

    void refill(Machine machine, int count) {
        System.out.println("Not allowed!");
    }
}
