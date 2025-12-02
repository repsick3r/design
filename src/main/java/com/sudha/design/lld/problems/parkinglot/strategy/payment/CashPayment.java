package com.sudha.design.lld.problems.parkinglot.strategy.payment;

import com.sudha.design.lld.problems.parkinglot.model.PaymentStrategy;
import com.sudha.design.lld.problems.parkinglot.model.Ticket;

public class CashPayment implements PaymentStrategy {
    @Override
    public boolean processPayment(Ticket ticket, double amount) {
        System.out.println("Paid amount: " + amount + " for vehicle " + ticket.getVehicle().getNumber() + " via CASH");
        return true;
    }
}
