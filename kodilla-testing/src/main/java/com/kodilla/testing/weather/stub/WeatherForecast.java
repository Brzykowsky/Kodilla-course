package com.kodilla.testing.weather.stub;

import java.util.*;
import java.util.Collections;

public class WeatherForecast {
    private Temperatures temperatures;


    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {

        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 Celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
        }
        return resultMap;
    }

    public double averageTemperatureMethod(Map<String, Double> map){

        double result;
        double sum = 0;
        for (Double value : map.values()) {
            sum += value;
        }
        return result = sum/map.size();
    }

    public double medianTemperaturesMethod(Map<String, Double> map){

        List<Double> sortedList = new ArrayList<>(map.values());
        Collections.sort(sortedList);

        double result;
            if(sortedList.size() % 2 == 0){
                result = ((sortedList.size()/2 - 1) + (sortedList.size()/2 + 1))/2;
        }else {
                result = sortedList.get(sortedList.size()/2);
            }
            return result;
    }
}