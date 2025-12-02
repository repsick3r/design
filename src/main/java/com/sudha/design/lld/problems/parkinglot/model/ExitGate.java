package com.sudha.design.lld.problems.parkinglot.model;

import com.sudha.design.lld.problems.parkinglot.ParkingLot;
import com.sudha.design.lld.problems.parkinglot.enums.GateType;
import com.sudha.design.lld.problems.parkinglot.enums.PaymentMode;

import java.time.LocalDateTime;

public class ExitGate extends Gate {
    public ExitGate(String id) {
        super(id);
    }

    @Override
    public GateType getType() {
        return GateType.EXIT;
    }

    public void unparkVehicle(String ticketId, LocalDateTime exitTime, PaymentMode mode) {
        ParkingLot.getInstance().unparkVehicle(ticketId, exitTime, mode);
    }
}
