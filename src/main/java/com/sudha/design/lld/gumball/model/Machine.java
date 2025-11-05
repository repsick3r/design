package com.sudha.design.lld.gumball.model;

import java.util.Random;

public class Machine {
    static final State noCoin = new NoCoin();
    static final State hasCoin = new HasCoin();
    static final State sold = new Sold();
    static final State winner = new Winner();
    static final State soldOut = new SoldOut();
    private State state;
    int count = 0;
    static final int MAX_COUNT = 3;

    public Machine(int count) {
        this.count = count;
        if(count > 0){
            state = noCoin;
        }
        else{
            state = soldOut;
        }
    }

    public void insertCoin() {
        state.insertCoin(this);
    }

    public void ejectCoin() {
        state.ejectCoin(this);
    }

    public void turnCrank() {
        boolean good = state.turnCrank(this);
        if (good) {
            state.dispense(this);
        }
    }

    public void refill(int count) {
        state.refill(this, count);
    }

    public int getBalls() {
        return count;
    }

    public void setState(State state) {
        this.state = state;
    }

    public boolean getWinner() {
        int winner = new Random(System.currentTimeMillis()).nextInt(10);
        return winner == 0;
    }

    public void releaseBalls(int balls) {
        System.out.println("Gumballs coming up : " + balls);
        count -= balls;
    }

    public void addBalls(int balls) {
        count += balls;
    }
}
