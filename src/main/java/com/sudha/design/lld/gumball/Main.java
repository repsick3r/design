package com.sudha.design.lld.gumball;

import com.sudha.design.lld.gumball.model.Machine;

public class Main {
    static void main() {
        Machine gumballs = new Machine(2);
        gumballs.refill(2);
        gumballs.refill(1);
        gumballs.turnCrank();
        gumballs.insertCoin();
        gumballs.ejectCoin();
        gumballs.turnCrank();
        gumballs.insertCoin();
        gumballs.turnCrank();
        gumballs.refill(1);
    }
}
