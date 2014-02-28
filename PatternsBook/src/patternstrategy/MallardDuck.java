package patternstrategy;

/**
 * Project: PatternsBook
 * Date: 24.08.13
 * Time: 20:58
 *
 * @author Skurishin Vladislav
 */
public class MallardDuck extends Duck {

    public  MallardDuck(){
        // фишка паттерна
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println ("I'am a real Mallard duck");
    }
}
