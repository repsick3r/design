package com.sudha.design.lld.weather.model.classes;

import com.sudha.design.lld.weather.model.interfaces.Display;
import com.sudha.design.lld.weather.model.interfaces.Observer;
import com.sudha.design.lld.weather.model.interfaces.Subject;

public class CurrentConditionsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Subject weatherData) {
        weatherData.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions are temperature : " + temperature + " and humidity : " + humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
