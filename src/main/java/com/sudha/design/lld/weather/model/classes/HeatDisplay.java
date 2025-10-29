package com.sudha.design.lld.weather.model.classes;

import com.sudha.design.lld.weather.model.interfaces.Display;
import com.sudha.design.lld.weather.model.interfaces.Observer;

public class HeatDisplay implements Observer, Display {
    private float t;
    private float rh;

    public HeatDisplay(WeatherData weatherData) {
        weatherData.addObserver(this);
    }

    private float computeHeatIndex() {
        return (float) ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh) +
                (0.00941695 * (t * t)) + (0.00728898 * (rh * rh)) +
                (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
                (0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
                (rh * rh * rh)) + (0.00000142721 * (t * t * t * rh)) +
                (0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
                0.000000000843296 * (t * t * rh * rh * rh)) -
                (0.0000000000481975 * (t * t * t * rh * rh * rh)));
    }

    @Override
    public void display() {
        System.out.println("Head Index is : " + computeHeatIndex());
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.t = temp;
        this.rh = humidity;
        display();
    }
}
