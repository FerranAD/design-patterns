package displays;

import exceptions.NoDataAvailableException;
import weather.Observer;
import weather.WeatherData;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    private final WeatherData weatherData;
    private final String HEADER = "Current conditions: temperature: %.1f humidity: %.1f";
    private Double temperature;
    private Double humidity;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public String display() {
        return displayIfAvailableData();
    }

    private String displayIfAvailableData() {
        if (temperature == null || humidity == null) {
            throw new NoDataAvailableException();
        }
        return String.format(HEADER, temperature, humidity);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
