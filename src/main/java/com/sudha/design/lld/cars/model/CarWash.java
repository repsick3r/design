package com.sudha.design.lld.cars.model;

import java.util.AbstractMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class CarWash {
    private final ConcurrentLinkedQueue<Map.Entry<Car, Integer>> cars;
    private final AtomicInteger counter;

    public CarWash() {
        cars = new ConcurrentLinkedQueue<>();
        counter = new AtomicInteger(0);
    }

    public void enterLine(Car car) {
        if (car instanceof Seltos) {
            System.out.println("This " + car.getModel() + "'s car " + ((Seltos) car).sunRoofStatus());
        } else if (car instanceof Dzire) {
            System.out.println("This " + car.getModel() + "'s car " + ((Dzire) car).electricStatus());
        }
        cars.add(new AbstractMap.SimpleEntry<>(car, counter.incrementAndGet()));
    }

    public synchronized void wash() {
        Map.Entry<Car, Integer> car = cars.poll();
        if (car != null) {
            System.out.println("Started washing car : " + car.getKey().getModel() + " at queue " +
                    "position " + car.getValue());
            try {
                Thread.sleep((long) (Math.random() * 2000) + 500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Finished washing car : " + car.getKey().getModel() + " at queue " +
                    "position " + car.getValue());
        } else {
            System.out.println("No cars are waiting for a wash!");
        }
    }
}
