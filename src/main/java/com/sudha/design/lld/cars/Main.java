package com.sudha.design.lld.cars;

import com.sudha.design.lld.cars.model.Car;
import com.sudha.design.lld.cars.model.CarWash;
import com.sudha.design.lld.cars.model.Dzire;
import com.sudha.design.lld.cars.model.Seltos;

import java.time.LocalDateTime;

public class Main {
    public static void main(){
        Car dzire = new Dzire(2020);
        Car seltos = new Seltos(2023);
        Car dzire2 = new Dzire(2025);
        CarWash station = new CarWash();
        station.enterLine(dzire);
        station.enterLine(seltos);
        station.enterLine(dzire2);
        System.out.println(LocalDateTime.now());
        station.wash();
        System.out.println(LocalDateTime.now());
        station.wash();
        System.out.println(LocalDateTime.now());
        station.wash();
        station.wash();
    }
}
