package com.sudha.design.lld.weather.model.classes;

import com.sudha.design.lld.weather.model.interfaces.Display;
import com.sudha.design.lld.weather.model.interfaces.Observer;

public class StatisticsDisplay implements Observer, Display {
    private float minTemp;
    private float maxTemp;
    private float totalTemp;
    private int updates;
    private float avgTemp;

    public StatisticsDisplay(WeatherData weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Statistics for temperature are minimum : " + minTemp + " maximum : " + maxTemp + " " +
                "and average : " + avgTemp);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        if (temp > maxTemp) {
            maxTemp = temp;
        }
        if (temp < minTemp) {
            minTemp = temp;
        }
        totalTemp += temp;
        updates++;
        avgTemp = totalTemp / updates;
        display();
    }
}
