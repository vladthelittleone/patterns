package patternstrategy;

/**
 * Project: PatternsBook
 * Date: 24.08.13
 * Time: 20:37
 *
 * @author Skurishin Vladislav
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println ("I can't fly");
    }
}
