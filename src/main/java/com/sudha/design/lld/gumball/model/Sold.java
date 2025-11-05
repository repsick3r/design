package com.sudha.design.lld.gumball.model;

public class Sold extends State{
    @Override
    public void dispense(Machine machine) {
        machine.releaseBalls(1);
        if(machine.getBalls() > 0){
            machine.setState(Machine.noCoin);
        }
        else{
            machine.setState(Machine.soldOut);
        }
    }
}
