package patterndecorator;

/**
 * Project: PatternsBook
 * Date: 27.08.13
 * Time: 20:36
 *
 * @author Skurishin Vladislav
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
