package com.sudha.design.lld.problems.parkinglot.model;

import com.sudha.design.lld.problems.parkinglot.enums.PaymentStatus;

import java.time.LocalDateTime;

public class Ticket {
    private final String id;
    private final LocalDateTime entryTime;
    private final String spotId;
    private final String floorId;
    private final Vehicle vehicle;
    private PaymentStatus status;


    public Ticket(String id, LocalDateTime entryTime, String spotId, String floorId, Vehicle vehicle) {
        this.id = id;
        this.entryTime = entryTime;
        this.spotId = spotId;
        this.floorId = floorId;
        this.vehicle = vehicle;
        this.status = PaymentStatus.PENDING;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public String getSpotId() {
        return spotId;
    }

    public String getFloorId() {
        return floorId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }
}
