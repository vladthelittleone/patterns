package patternfactory;

/**
 * Project: PatternsBook
 * Date: 28.08.13
 * Time: 16:37
 *
 * @author Skurishin Vladislav
 *
 * Пример фабрики - не паттерна;
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new NYStyleCheesePizza(new NYPizzaIngredientFactory());
        } else if (type.equals("pepperoni")){
            pizza = new NYStylePepperoniPizza(new NYPizzaIngredientFactory());
        }

        return pizza;
    }
}
