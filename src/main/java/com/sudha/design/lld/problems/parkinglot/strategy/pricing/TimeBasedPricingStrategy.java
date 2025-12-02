package com.sudha.design.lld.problems.parkinglot.strategy.pricing;

import com.sudha.design.lld.problems.parkinglot.enums.VehicleType;
import com.sudha.design.lld.problems.parkinglot.model.PricingStrategy;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TimeBasedPricingStrategy implements PricingStrategy {

    private static final LocalTime PEAK_HOUR_START = LocalTime.of(8, 0);
    private static final LocalTime PEAK_HOUR_END = LocalTime.of(17, 0);

    private boolean isPeak(LocalTime time) {
        return !time.isBefore(PEAK_HOUR_START) && !time.isAfter(PEAK_HOUR_END);
    }

    @Override
    public double calculateFee(LocalDateTime entryTime, LocalDateTime exitTime, VehicleType type) {
        if (exitTime.isBefore(entryTime)) throw new IllegalStateException("Not possible check again!");

        long minutes = Duration.between(entryTime, exitTime).toMinutes();
        long hours = (long) Math.ceil(minutes / 60.0);

        int peakHours = 0;
        int nonPeakHours = 0;
        LocalDateTime cursor = entryTime.truncatedTo(ChronoUnit.HOURS);

        for (int i = 0; i < hours; i++) {
            LocalTime hourStart = cursor.toLocalTime();
            if (isPeak(hourStart)) peakHours++;
            else nonPeakHours++;
        }

        double peakRate = switch (type) {
            case CAR -> 70.0;
            case BIKE -> 40.0;
            case TRUCK -> 100.0;
        };

        double nonPeakRate = switch (type) {
            case CAR -> 50.0;
            case BIKE -> 30.0;
            case TRUCK -> 70.0;
        };

        return peakRate * peakHours + nonPeakRate * nonPeakHours;
    }
}
