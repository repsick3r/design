package com.sudha.design.lld.gumball.model;

public class HasCoin extends State{
    @Override
    public boolean turnCrank(Machine machine) {
        if(machine.getWinner() && machine.getBalls() > 1){
            System.out.println("You are a winner!");
            machine.setState(Machine.winner);
        }
        else{
            System.out.println("You turned the crank!");
            machine.setState(Machine.sold);
        }
        return true;
    }

    @Override
    public void ejectCoin(Machine machine) {
        System.out.println("Giving your coin back!");
        machine.setState(Machine.noCoin);
    }
}
