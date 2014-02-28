package patternfactory;

/**
 * Project: PatternsBook
 * Date: 28.08.13
 * Time: 16:43
 *
 * @author Skurishin Vladislav
 *
 * абстрактный класс создатель
 */
public abstract class PizzaStore {

    /**
     * Фабричный метод сам
     * определяет какого типа будет
     * пицца. а PizzaStore
     * лишь знает, что он реализует интерфейс
     * Pizza.
     */
    public Pizza orderPizza(String type){
        Pizza pizza = null;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * Фабричный метод, который дает сабклассу создать
     * определенную реализацию (например: Нью-Йоркскую пиццу
     * класса <code>NYStylePizzaStore</code>)
     */
    abstract Pizza createPizza (String type);
}
