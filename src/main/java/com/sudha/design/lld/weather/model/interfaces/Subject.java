package com.sudha.design.lld.weather.model.interfaces;

public interface Subject {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
