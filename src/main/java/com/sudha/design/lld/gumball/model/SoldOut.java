package com.sudha.design.lld.gumball.model;

public class SoldOut extends State{
    @Override
    public void refill(Machine machine, int count) {
        if(machine.getBalls() + count > Machine.MAX_COUNT) {
            System.out.println("Too many balls!");
        }
        else{
            System.out.println("Added : " + count + " balls!");
            machine.addBalls(count);
            machine.setState(Machine.noCoin);
        }
    }
}
