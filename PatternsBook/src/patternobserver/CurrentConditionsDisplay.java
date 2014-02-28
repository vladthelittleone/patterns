package patternobserver;

/**
 * Project: PatternsBook
 * Date: 26.08.13
 * Time: 0:20
 *
 * @author Skurishin Vladislav
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println ("Current conditions: " + temperature +
                "F degrees and " + humidity + "% humiduty");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
