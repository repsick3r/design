package com.sudha.design.lld.problems.parkinglot.factory;

import com.sudha.design.lld.problems.parkinglot.enums.PricingStrategyType;
import com.sudha.design.lld.problems.parkinglot.model.PricingStrategy;
import com.sudha.design.lld.problems.parkinglot.strategy.pricing.EventBasedPricingStrategy;
import com.sudha.design.lld.problems.parkinglot.strategy.pricing.TimeBasedPricingStrategy;

public class PricingStrategyFactory {
    public static PricingStrategy create(PricingStrategyType type) {
        return switch (type) {
            case EVENT_BASED -> new EventBasedPricingStrategy();
            case TIME_BASED -> new TimeBasedPricingStrategy();
        };
    }
}
