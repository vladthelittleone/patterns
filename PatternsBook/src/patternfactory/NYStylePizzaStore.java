package patternfactory;

/**
 * Project: PatternsBook
 * Date: 28.08.13
 * Time: 16:54
 *
 * @author Skurishin Vladislav
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;

        // фабрика ингридиентов.
        PizzaIngredientFactory pizzaIngredientFactory =
                new NYPizzaIngredientFactory();

        if (type.equals("cheese")){
            pizza = new NYStyleCheesePizza(pizzaIngredientFactory);
        } else if (type.equals("pepperoni")){
            pizza = new NYStylePepperoniPizza(pizzaIngredientFactory);
        }

        return pizza;
    }
}
