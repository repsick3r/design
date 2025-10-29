package com.sudha.design.lld.weather;

import com.sudha.design.lld.weather.model.classes.CurrentConditionsDisplay;
import com.sudha.design.lld.weather.model.classes.HeatDisplay;
import com.sudha.design.lld.weather.model.classes.StatisticsDisplay;
import com.sudha.design.lld.weather.model.classes.WeatherData;

public class WeatherStation {
    static void main() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setMeasurements(3F, 2.4F, 3.6F);
        weatherData.setMeasurements(12, 3.4F, 1.8F);
        HeatDisplay heatDisplay = new HeatDisplay(weatherData);
        weatherData.setMeasurements(5F, 5F, 2.2F);
    }
}
