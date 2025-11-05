package com.sudha.design.lld.gumball.model;

public class Winner extends State{
    @Override
    public void dispense(Machine machine) {
        machine.releaseBalls(2);
        if(machine.getBalls() > 0){
            machine.setState(Machine.noCoin);
        }
        else{
            machine.setState(Machine.soldOut);
        }
    }
}
