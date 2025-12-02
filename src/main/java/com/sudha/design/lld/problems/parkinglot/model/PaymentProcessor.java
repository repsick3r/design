package com.sudha.design.lld.problems.parkinglot.model;

import com.sudha.design.lld.problems.parkinglot.enums.PaymentStatus;

public class PaymentProcessor {
    private final PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public boolean pay(Ticket ticket, double amount) {
        boolean success = paymentStrategy.processPayment(ticket, amount);
        if (success) {
            ticket.setStatus(PaymentStatus.SUCCESS);
        } else {
            ticket.setStatus(PaymentStatus.FAILURE);
        }
        return success;
    }
}
