package patternobsjapi;

import java.util.Observable;
import java.util.Observer;

/**
 * Project: PatternsBook
 * Date: 26.08.13
 * Time: 1:12
 *
 * @author Skurishin Vladislav
 */
public class ForecastDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (observable instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        // TODO
    }
}
