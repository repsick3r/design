package com.sudha.design.lld.problems.parkinglot.model;

public interface PaymentStrategy {
    boolean processPayment(Ticket ticket, double amount);
}
