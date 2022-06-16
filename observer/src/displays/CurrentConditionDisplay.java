package displays;

import vo.MeasurementVo;
import weather.Observer;
import weather.WeatherData;

import java.util.ArrayList;
import java.util.List;

public class CurrentConditionDisplay implements DisplayElement, Observer {
    private List<MeasurementVo> measurements;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.measurements = new ArrayList<>();
        weatherData.registerObserver(this);
        weatherData.getMesurements();
    }

    @Override
    public String display() {
        return measurements.stream()
                .map(measurement -> measurement.name() + ": " + measurement.value() + " ")
                .reduce(HEADER, (str1, str2) -> str1 + str2);
    }

    @Override
    public void update(Object o) {
        var newMeasurements = (List<MeasurementVo>) o;
        this.measurements = newMeasurements;
        display();
    }
}
