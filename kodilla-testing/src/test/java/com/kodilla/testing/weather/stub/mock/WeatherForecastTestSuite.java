package com.kodilla.testing.weather.stub.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import java.util.HashMap;
import java.util.Map;
import static org.mockito.Mockito.when;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {
    private static Map<String, Double> temperaturesMap = new HashMap<>();

    @BeforeAll
    public static void beforeAll() {
        temperaturesMap.put("Rzeszow", 24.0);
        temperaturesMap.put("Krakow", 25.0);
        temperaturesMap.put("Wroclaw", 26.0);
        temperaturesMap.put("Warszawa", 23.0);
        temperaturesMap.put("Gdansk", 22.0);
    }



    @Mock
    private Temperatures temperaturesMock;

    @DisplayName("Test of a Weather Forecast")
    @Test
    void testCalculateForecastWithMock() {

        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @DisplayName("Test average temperature")
    @Test
    void testAverageTemperature(){
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double average = weatherForecast.averageTemperatureMethod(temperaturesMap);
        //Then
        Assertions.assertEquals(24,average);
    }

    @DisplayName("Test median temperature")
    @Test
    void testMedianTemperature(){
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);
        //When
        double median = weatherForecast.medianTemperaturesMethod(temperaturesMap);
        //Then
        Assertions.assertEquals(24,median);
    }
}
