package com.sudha.design.lld.problems.parkinglot.model;

import com.sudha.design.lld.problems.parkinglot.enums.VehicleType;

import java.time.LocalDateTime;

public interface PricingStrategy {
    double calculateFee(LocalDateTime entryTime, LocalDateTime exitTime, VehicleType type);
}
