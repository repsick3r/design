package com.sudha.design.lld.problems.parkinglot.model;

import com.sudha.design.lld.problems.parkinglot.ParkingLot;
import com.sudha.design.lld.problems.parkinglot.enums.GateType;

import java.time.LocalDateTime;

public class EntryGate extends Gate {
    public EntryGate(String id) {
        super(id);
    }

    @Override
    public GateType getType() {
        return GateType.ENTRY;
    }

    public Ticket parkVehicle(Vehicle vehicle, LocalDateTime entryTime) {
        return ParkingLot.getInstance().parkVehicle(vehicle, entryTime);
    }
}
