package patternfactory;

/**
 * Project: PatternsBook
 * Date: 28.08.13
 * Time: 16:57
 *
 * @author Skurishin Vladislav
 */
public class NYStyleCheesePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public NYStyleCheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println ("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSouce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
