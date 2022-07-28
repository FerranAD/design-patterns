package observer;

import observer.displays.CurrentConditionDisplay;
import observer.displays.HeatIndexDisplay;
import observer.exceptions.NoDataAvailableException;
import observer.weather.WeatherData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class WeatherDataTest {
    private WeatherData weatherData;

    @BeforeEach
    void setUp() {
        weatherData = new WeatherData();
    }

    @Test
    void NoDataCurrentConditionDisplayTest() {
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        assertThrows(NoDataAvailableException.class, currentConditionDisplay::display);
    }

    @Test
    void NoDataHeatIndexDisplayTest() {
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        assertThrows(NoDataAvailableException.class, heatIndexDisplay::display);
    }

    @Test
    void MeasurementsUpdateCurrentConditionDisplayTest() {
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(10.0, 10.0, 10.0);
        assertEquals(
                "Current conditions: temperature: 10.0 humidity: 10.0",
                currentConditionDisplay.display()
        );
    }

    @Test
    void MeasurementsUpdateHeatIndexDisplayTest() {
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(10.0, 10.0, 10.0);
        assertEquals(
                "Heat index is: 20.0",
                heatIndexDisplay.display()
        );
    }
}