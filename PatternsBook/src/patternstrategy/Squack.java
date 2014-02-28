package patternstrategy;

/**
 * Project: PatternsBook
 * Date: 24.08.13
 * Time: 20:41
 *
 * @author Skurishin Vladislav
 */
public class Squack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println ("Squack");
    }
}
