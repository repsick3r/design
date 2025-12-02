package com.sudha.design.lld.problems.parkinglot.strategy.pricing;

import com.sudha.design.lld.problems.parkinglot.enums.VehicleType;
import com.sudha.design.lld.problems.parkinglot.model.PricingStrategy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Map;

public class EventBasedPricingStrategy implements PricingStrategy {

    private static final Map<VehicleType, Double> EVENT_HOURLY_RATES = Map.of(
            VehicleType.CAR, 50.0,
            VehicleType.TRUCK, 70.0,
            VehicleType.BIKE, 30.0);

    @Override
    public double calculateFee(LocalDateTime entryTime, LocalDateTime exitTime, VehicleType type) {
        long minutes = Duration.between(entryTime, exitTime).toMinutes();
        long hours = (long) Math.ceil(minutes / 60.0);
        return hours * EVENT_HOURLY_RATES.getOrDefault(type, 0.0);
    }
}
