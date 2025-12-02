package com.sudha.design.lld.problems.parkinglot.model;

import com.sudha.design.lld.problems.parkinglot.enums.VehicleType;

import java.util.concurrent.atomic.AtomicBoolean;

public class Spot {
    private final String id;
    private final VehicleType type;

    private final AtomicBoolean occupied = new AtomicBoolean(false);

    public Spot(String id, VehicleType type) {
        this.id = id;
        this.type = type;
    }

    public boolean tryOccupy() {
        return occupied.compareAndSet(false, true);
    }

    public void empty() {
        occupied.set(false);
    }

    public boolean getStatus() {
        return occupied.get();
    }

    public String getId() {
        return id;
    }

    public VehicleType getType() {
        return type;
    }
}
