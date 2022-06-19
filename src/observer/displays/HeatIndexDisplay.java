package observer.displays;

import observer.exceptions.NoDataAvailableException;
import observer.weather.Observer;
import observer.weather.WeatherData;

public class HeatIndexDisplay implements DisplayElement, Observer {
    private final String HEADER = "Heat index is: ";
    private final WeatherData weatherData;
    private Double temperature;
    private Double humidity;

    public HeatIndexDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public String display() {
        return displayMessage();
    }

    private String displayMessage() {
        try {
            return HEADER + calculateHeatIndex(temperature, humidity);
        } catch (NullPointerException e) {
            throw new NoDataAvailableException();
        }
    }

    private String calculateHeatIndex(Double temperature, Double humidity) {
        return String.valueOf(temperature + humidity );
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }
}
