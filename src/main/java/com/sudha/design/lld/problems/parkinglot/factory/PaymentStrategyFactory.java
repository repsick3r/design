package com.sudha.design.lld.problems.parkinglot.factory;

import com.sudha.design.lld.problems.parkinglot.enums.PaymentMode;
import com.sudha.design.lld.problems.parkinglot.model.PaymentStrategy;
import com.sudha.design.lld.problems.parkinglot.strategy.payment.CashPayment;
import com.sudha.design.lld.problems.parkinglot.strategy.payment.UpiPayment;

public class PaymentStrategyFactory {
    public static PaymentStrategy create(PaymentMode mode) {
        return switch (mode) {
            case UPI -> new UpiPayment();
            case CASH -> new CashPayment();
        };
    }
}
