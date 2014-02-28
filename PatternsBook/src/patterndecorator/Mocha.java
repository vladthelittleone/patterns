package patterndecorator;

/**
 * Project: PatternsBook
 * Date: 27.08.13
 * Time: 20:34
 *
 * @author Skurishin Vladislav
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
