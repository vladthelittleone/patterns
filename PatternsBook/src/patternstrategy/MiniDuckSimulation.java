package patternstrategy;

/**
 * Project: PatternsBook
 * Date: 24.08.13
 * Time: 20:55
 *
 * @author Skurishin Vladislav
 *
 * Описан паттерн Стратегия:
 * реализация алгоритмов объека (поведений объекта),
 * которые имеют разную реализацию в программе и постоянно изменяются (fly() и quack()),
 * происходит с помощью создания отдельных интерфейсов (FluBehavior, QuackBehavior) для поведения и
 * реализации этого интерфейса классами (FlyNoWay),включении онного в базовый класс (Duck), как
 * отдельную переменную.
 *
 * Определение паттерна стратегия:
 * Определяет семейство алгоритмов, инкапсулирует каждый из них и обеспечивает их взаимозаменяемость.
 * Позволяет модифицировать алгоритмы не зависимо от их использования на стороне клиента.
 */
public class MiniDuckSimulation {
    public static void main (String args[]){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performFly();
    }
}
