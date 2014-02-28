package patternstrategy;

/**
 * Project: PatternsBook
 * Date: 24.08.13
 * Time: 21:09
 *
 * @author Skurishin Vladislav
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println ("I'am flying with a rocket!");
    }
}
