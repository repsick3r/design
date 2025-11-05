package com.sudha.design.lld.gumball.model;

public class NoCoin extends State{
    @Override
    public void insertCoin(Machine machine) {
        System.out.println("You have inserted a coin!");
        machine.setState(Machine.hasCoin);
    }

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
