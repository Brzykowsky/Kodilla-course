package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.TemperaturesStub;
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
    private Temperatures temp;

    @DisplayName("Test of a Weather Forecast")
    @Test
    void testCalculateForecastWithMock() {

        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temp);
        when(temp.getTemperatures()).thenReturn(temperaturesMap);

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @DisplayName("Test with Stub")
    @Test
    void testCalculateForecastWithStub() {
        //Given
        Temperatures temperatures = new TemperaturesStub();                     // [1]
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);    // [2]

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();

        //Then
        Assertions.assertEquals(5, quantityOfSensors);
    }

    @DisplayName("Test average temperature")
    @Test
    void testAverageTemperature(){
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temp);
        when(temp.getTemperatures()).thenReturn(temperaturesMap);
        //When
        double average = weatherForecast.averageTemperatureMethod();
        //Then
        Assertions.assertEquals(24,average);
    }

    @DisplayName("Test median temperature")
    @Test
    void testMedianTemperature(){
        //Given
        WeatherForecast weatherForecast = new WeatherForecast(temp);
        when(temp.getTemperatures()).thenReturn(temperaturesMap);
        //When
        double median = weatherForecast.medianTemperaturesMethod();
        //Then
        Assertions.assertEquals(24,median);
    }
}
