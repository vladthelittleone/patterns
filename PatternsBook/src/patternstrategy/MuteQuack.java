package patternstrategy;

/**
 * Project: PatternsBook
 * Date: 24.08.13
 * Time: 20:39
 *
 * @author Skurishin Vladislav
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println ("<< Silence >>");
    }
}
