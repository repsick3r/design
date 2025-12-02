package com.sudha.design.lld.problems.parkinglot.model;

import com.sudha.design.lld.problems.parkinglot.enums.VehicleType;

public class Car extends Vehicle {
    public Car(String number) {
        super(number, VehicleType.CAR);
    }
}
