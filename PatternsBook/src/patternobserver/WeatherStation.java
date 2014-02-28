package patternobserver;

/**
 * Project: PatternsBook
 * Date: 26.08.13
 * Time: 0:27
 *
 * @author Skurishin Vladislav
 *
 * Паттерн Наблюдатель:
 * определяет отношения "один-ко-многим" таким образом,
 * что при изменении состояния одного объекта происходит
 * автоматическое оповещение и обновление всех зависимых объектов.
 */
public class WeatherStation {
    public static void main(String args[]){
        WeatherData weatherData = new WeatherData();

        Observer currentDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMessurements(80, 65, 40.5f);
        weatherData.setMessurements(82, 63, 40.7f);
        weatherData.setMessurements(83, 61, 41.5f);
    }
}
