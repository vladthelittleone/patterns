package patternobserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Project: PatternsBook
 * Date: 26.08.13
 * Time: 0:09
 *
 * @author Skurishin Vladislav
 */
public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers){
            obs.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanges(){
        notifyObservers();
    }

    public void setMessurements(float temperature, float humidity, float pressure){
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        measurementsChanges();
    }
}
