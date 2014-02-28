package patternadaptations.adapter;

/**
 * Project: PatternsBook
 * Date: 26.09.13
 * Time: 0:03
 *
 * @author Skurishin Vladislav
 *
 * Паттерн Адаптер преобразует интерфейс класса к другому интерфейсу,
 * на который рассчитан клиент. Адаптер обеспечивает совметсную работу классов,
 * невозможную в обычных условиях из-за несовместимости интерфейсов.
 */
public class DuckTestDrive {
    public static void main(String args[]){
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
//      Сам адаптер
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println ("This Turkey says ...");
        turkey.gobble();
        turkey.fly();

        System.out.println ("\nDuck says ...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
