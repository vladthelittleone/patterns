package patternfactory;

/**
 * Project: PatternsBook
 * Date: 28.08.13
 * Time: 17:30
 *
 * @author Skurishin Vladislav
 *
 * Паттерн Фабричный Метод:
 * Определяет интерфейс создания объекта,
 * но позволяет субклассам выбрать класс создаваемого
 * экземпляра. Таким образом, Фабричный метод делегирует
 * операцию создания экземпляра субкласса.
 *
 * так же для ингридиентов пиццы используется
 * паттерн Абстрактная Фабрика:
 * предоставляет интерфейс создания семейства
 * взаимосвязанных и взаимозависимых
 * объектов без указания их конкретных классов.
 */
public class PizzaTestDrive {
    public static void main(String args[]){
        PizzaStore nyStylePizzaStoretore = new NYStylePizzaStore();

        Pizza pizza = nyStylePizzaStoretore.orderPizza("cheese");
        System.out.println ("Ethan order a " + pizza.getName() + "\n");
    }
}
