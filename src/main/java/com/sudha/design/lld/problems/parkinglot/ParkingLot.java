package com.sudha.design.lld.problems.parkinglot;

import com.sudha.design.lld.problems.parkinglot.enums.PaymentMode;
import com.sudha.design.lld.problems.parkinglot.enums.PricingStrategyType;
import com.sudha.design.lld.problems.parkinglot.factory.PaymentStrategyFactory;
import com.sudha.design.lld.problems.parkinglot.factory.PricingStrategyFactory;
import com.sudha.design.lld.problems.parkinglot.model.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ParkingLot {
    private static final ParkingLot parkingLot = new ParkingLot();
    private final Map<String, Floor> floors = new HashMap<>();
    private final Map<String, Ticket> activeTickets = new HashMap<>();
    private PricingStrategy pricingStrategy;

    private ParkingLot() {
        this.pricingStrategy = PricingStrategyFactory.create(PricingStrategyType.TIME_BASED);
    }

    public static ParkingLot getInstance() {
        return parkingLot;
    }

    public void addFloor(Floor floor) {
        floors.put(floor.getId(), floor);
    }

    public Ticket parkVehicle(Vehicle vehicle, LocalDateTime entryTime) {
        for (Floor floor : floors.values()) {
            Spot spot = floor.getSpot(vehicle.getType());
            if (spot != null) {
                String ticketId = UUID.randomUUID().toString();
                Ticket ticket = new Ticket(ticketId, entryTime, spot.getId(), floor.getId(), vehicle);
                activeTickets.put(ticketId, ticket);
                System.out.println("Vehicle parked, ticket : " + ticketId);
                return ticket;
            }
        }
        System.out.println("No parking spot available for vehicleType: " + vehicle.getType().name());
        return null;
    }

    public void unparkVehicle(String ticketId, LocalDateTime exitTime, PaymentMode paymentMode) {
        Ticket ticket = activeTickets.get(ticketId);

        if (ticket == null) {
            System.out.println("Invalid ticket ID.");
        }

        double fee = pricingStrategy.calculateFee(ticket.getEntryTime(), exitTime, ticket.getVehicle().getType());

        PaymentStrategy paymentStrategy = PaymentStrategyFactory.create(paymentMode);
        boolean paid = paymentStrategy.processPayment(ticket, fee);

        if (!paid) {
            System.out.println("Payment failed, vehicle cannot exit!");
            return;
        }

        Spot spot = floors.get(ticket.getFloorId()).getSpots().get(ticket.getSpotId());
        spot.empty();
        activeTickets.remove(ticketId);

        System.out.println("Vehicle exited, fee charged: " + fee);
    }

    public void setPricingStrategy(PricingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }

    public void printStatus() {
        for (Floor floor : floors.values()) {
            System.out.println("Floor status with id: " + floor.getId());
            for (Spot spot : floor.getSpots().values()) {
                System.out.println("Spot of type: " + spot.getType() + " is " + (spot.getStatus() ? "occupied" : " free"));
            }
        }
    }
}
