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

    public double averageTemperatureMethod(){

        List<Double> ListOfTemperatures = new ArrayList<>(temperatures.getTemperatures().values());
        double result;
        double sum = 0;
        for (Double value : ListOfTemperatures) {
            sum += value;
        }
        return result = sum / ListOfTemperatures.size();
    }

    public double medianTemperaturesMethod(){

        List<Double>sortedList = new ArrayList<>(temperatures.getTemperatures().values());
        Collections.sort(sortedList);

            double result;
            if (sortedList.size() % 2 == 0) {
                result = ((sortedList.size() / 2) + (sortedList.size() / 2 + 1)) / 2;
            } else {
                result = sortedList.get(sortedList.size() / 2);
            }
            return result;
        }
    }