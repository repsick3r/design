package com.sudha.design.lld.weather.model.interfaces;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
