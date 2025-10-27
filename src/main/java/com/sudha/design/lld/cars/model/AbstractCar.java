package com.sudha.design.lld.cars.model;

public abstract class AbstractCar implements Car{
    String brand;
    String model;
    int make;

    public AbstractCar(String brand, String model, int make){
        this.brand=brand;
        this.model=model;
        this.make=make;
    }

    @Override
    public String getBrand(){
        return brand;
    }

    @Override
    public String getModel(){
        return model;
    }

    @Override
    public int getMake(){
        return make;
    }
}
