package patternobserver;

/**
 * Project: PatternsBook
 * Date: 25.08.13
 * Time: 23:42
 *
 * @author Skurishin Vladislav
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
