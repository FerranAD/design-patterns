package weather;

import vo.MeasurementVo;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private final List<Observer> observers;
    private MeasurementVo temperature;
    private MeasurementVo humidity;
    private MeasurementVo pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        var mesurements = getMesurements();
        observers.forEach( observer -> observer.update(mesurements));
    }

    public void setMeasurements(MeasurementVo temperature, MeasurementVo humidity, MeasurementVo pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObservers();
    }

    public List<MeasurementVo> getMesurements() {
        return getMesurementsList();
    }

    private List<MeasurementVo> getMesurementsList() {
        try {
            return List.of(temperature, humidity, pressure);
        } catch (NullPointerException e) {
            return List.of();
        }
    }
}
