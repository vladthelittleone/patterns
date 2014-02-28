package patternstrategy;

/**
 * Project: PatternsBook
 * Date: 24.08.13
 * Time: 20:31
 *
 * @author Skurishin Vladislav
 */
public abstract class Duck {
    // фишка паттерна
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck(){
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println ("All duck float, even decoys!");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }
}
