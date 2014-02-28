package patternstrategy;

/**
 * Project: PatternsBook
 * Date: 24.08.13
 * Time: 21:06
 *
 * @author Skurishin Vladislav
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println ("I'am a model duck");
    }
}
