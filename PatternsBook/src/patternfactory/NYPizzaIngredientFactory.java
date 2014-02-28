package patternfactory;

/**
 * Project: PatternsBook
 * Date: 28.08.13
 * Time: 18:16
 *
 * @author Skurishin Vladislav
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public String createDough() {
        return null;  // TODO
    }

    @Override
    public String createSouce() {
        return null;  // TODO
    }

    @Override
    public String createCheese() {
        return null;  // TODO
    }

    @Override
    public String[] createVeggies() {
        return new String[0];  // TODO
    }

    @Override
    public String createPepperoni() {
        return null;  // TODO
    }

    @Override
    public String createClam() {
        return null;  // TODO
    }
}
