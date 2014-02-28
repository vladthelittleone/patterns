package patternobsjapi;

import java.util.Observable;

/**
 * Project: PatternsBook
 * Date: 26.08.13
 * Time: 0:09
 *
 * @author Skurishin Vladislav
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    public void measurementsChanges() {
        setChanged();
        notifyObservers();
    }

    public void setMessurements(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        this.pressure = pressure;
        this.temperature = temperature;
        measurementsChanges();
    }

    public float getHumidity() {
        return humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }
}
