package patternobsjapi;

import java.util.Observable;
import java.util.Observer;

/**
 * Project: PatternsBook
 * Date: 26.08.13
 * Time: 0:20
 *
 * @author Skurishin Vladislav
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println ("Current conditions: " + temperature +
                "F degrees and " + humidity + "% humiduty");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
