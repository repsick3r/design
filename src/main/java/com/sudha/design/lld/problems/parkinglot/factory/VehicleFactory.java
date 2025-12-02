package com.sudha.design.lld.problems.parkinglot.factory;

import com.sudha.design.lld.problems.parkinglot.enums.VehicleType;
import com.sudha.design.lld.problems.parkinglot.model.Bike;
import com.sudha.design.lld.problems.parkinglot.model.Car;
import com.sudha.design.lld.problems.parkinglot.model.Truck;
import com.sudha.design.lld.problems.parkinglot.model.Vehicle;

public class VehicleFactory {
    public static Vehicle create(VehicleType vehicleType, String number) {
        return switch (vehicleType) {
            case CAR -> new Car(number);
            case TRUCK -> new Truck(number);
            case BIKE -> new Bike(number);
        };
    }
}
