package patternobserver;

/**
 * Project: PatternsBook
 * Date: 25.08.13
 * Time: 23:40
 *
 * @author Skurishin Vladislav
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
