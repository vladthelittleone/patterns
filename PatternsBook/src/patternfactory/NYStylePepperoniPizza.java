package patternfactory;

/**
 * Project: PatternsBook
 * Date: 28.08.13
 * Time: 17:09
 *
 * @author Skurishin Vladislav
 */
public class NYStylePepperoniPizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public  NYStylePepperoniPizza(PizzaIngredientFactory pizzaIngredientFactory) {
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
