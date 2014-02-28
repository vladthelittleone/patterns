package patterndecorator;

/**
 * Project: PatternsBook
 * Date: 27.08.13
 * Time: 20:32
 *
 * @author Skurishin Vladislav
 */
public class HouseBlend extends Beverage {

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
