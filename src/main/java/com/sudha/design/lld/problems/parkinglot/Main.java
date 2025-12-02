package com.sudha.design.lld.problems.parkinglot;

import com.sudha.design.lld.problems.parkinglot.enums.PaymentMode;
import com.sudha.design.lld.problems.parkinglot.enums.VehicleType;
import com.sudha.design.lld.problems.parkinglot.model.*;

import java.time.LocalDateTime;

public class Main {
    static void main() {
        ParkingLot parkingLot = ParkingLot.getInstance();
        EntryGate entryGate = new EntryGate("EG1");
        ExitGate exitGate = new ExitGate("XG1");

        Floor firstFloor = new Floor("First");
        firstFloor.addSpot(new Spot("1", VehicleType.CAR));
        firstFloor.addSpot(new Spot("2", VehicleType.CAR));
        firstFloor.addSpot(new Spot("3", VehicleType.BIKE));
        firstFloor.addSpot(new Spot("4", VehicleType.TRUCK));
        parkingLot.addFloor(firstFloor);

        Vehicle b1 = new Bike("KA01AX2323");
        Vehicle b2 = new Bike("KA01TY5678");
        Vehicle b3 = new Bike("KA01TY5689");
        Ticket t1 = entryGate.parkVehicle(b1, LocalDateTime.now());
        Ticket t2 = entryGate.parkVehicle(b2, LocalDateTime.now());
        exitGate.unparkVehicle(t1.getId(), LocalDateTime.now().plusHours(3), PaymentMode.CASH);
        Thread th1 = new Thread(() -> entryGate.parkVehicle(b3, LocalDateTime.now()));
        Thread th2 = new Thread(() -> entryGate.parkVehicle(b1, LocalDateTime.now()));
        th1.start();
        th2.start();
    }
}
