package com.sudha.design.lld.cars.model;

public class Dzire extends AbstractCar{
    public Dzire(int make){
        super("MARUTI SUZUKI", "Dzire", make);
    }

    public String electricStatus(){
        if(make >= 2025){
            return "is electric!";
        }
        else{
            return "is not electric!";
        }
    }
}
