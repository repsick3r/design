package com.sudha.design.lld.problems.parkinglot.model;

import com.sudha.design.lld.problems.parkinglot.enums.VehicleType;

import java.util.HashMap;
import java.util.Map;

public class Floor {
    private final String id;
    private final Map<String, Spot> spots = new HashMap<>();

    public Floor(String id) {
        this.id = id;
    }

    public void addSpot(Spot spot) {
        spots.put(spot.getId(), spot);
    }

    public Spot getSpot(VehicleType vehicleType) {
        for (Spot spot : spots.values()) {
            if (spot.getType() == vehicleType && spot.tryOccupy()) {
                return spot;
            }
        }
        return null;
    }

    public Map<String, Spot> getSpots() {
        return spots;
    }

    public String getId() {
        return id;
    }
}
