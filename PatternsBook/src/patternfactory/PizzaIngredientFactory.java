package patternfactory;

/**
 * Project: PatternsBook
 * Date: 28.08.13
 * Time: 18:11
 *
 * @author Skurishin Vladislav
 */
public interface PizzaIngredientFactory {
    public String createDough();
    public String createSouce();
    public String createCheese();
    public String[] createVeggies();
    public String createPepperoni();
    public String createClam();
}
