package com.sudha.design.lld.problems.parkinglot.model;

import com.sudha.design.lld.problems.parkinglot.enums.VehicleType;

public class Truck extends Vehicle {
    public Truck(String number) {
        super(number, VehicleType.TRUCK);
    }
}
