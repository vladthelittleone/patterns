package patterndecorator;

/**
 * Project: PatternsBook
 * Date: 27.08.13
 * Time: 20:32
 *
 * @author Skurishin Vladislav
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
