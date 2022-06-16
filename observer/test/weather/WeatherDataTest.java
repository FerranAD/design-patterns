package weather;

import displays.CurrentConditionDisplay;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vo.MeasurementVo;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WeatherDataTest {

    private WeatherData weatherData;

    @BeforeEach
    void setUp() {
        weatherData = new WeatherData();
        weatherData.setMeasurements(
                new MeasurementVo("temperature", 10),
                new MeasurementVo("humidity", 20),
                new MeasurementVo("pressure", 30)
        );
    }

    @Test
    void CurrentConditionDisplayTest() {
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        assertEquals(
                "Current conditions: temperature: 10.0 humidity: 20.0 pressure: 30.0 ",
                currentConditionDisplay.display()
        );
    }

    @Test
    void UpdateConditionDisplayTest() {
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(
                new MeasurementVo("temperature", 20),
                new MeasurementVo("humidity", 20),
                new MeasurementVo("pressure", 20)
        );
        assertEquals(
                "Current conditions: temperature: 20.0 humidity: 20.0 pressure: 20.0 ",
                currentConditionDisplay.display()
        );
    }
}