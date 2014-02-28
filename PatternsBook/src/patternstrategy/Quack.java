package patternstrategy;

/**
 * Project: PatternsBook
 * Date: 24.08.13
 * Time: 20:38
 *
 * @author Skurishin Vladislav
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println ("Quack");
    }
}
