package com.sudha.design.lld.cars.model;

public class Seltos extends AbstractCar {
    public Seltos(int make) {
        super("KIA", "Seltos", make);
    }

    public String sunRoofStatus() {
        if (make >= 2023) {
            return "has a sunroof!";
        } else {
            return "does not come with a sunroof!";
        }
    }
}
