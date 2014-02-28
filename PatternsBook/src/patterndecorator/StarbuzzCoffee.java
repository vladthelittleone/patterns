package patterndecorator;

/**
 * Project: PatternsBook
 * Date: 27.08.13
 * Time: 20:46
 *
 * @author Skurishin Vladislav
 */
public class StarbuzzCoffee {
    public static void main (String args[]){
        Beverage beverage = new Espresso();
        System.out.println (beverage.getDescription() + "$" + beverage.cost());

        Beverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);

        System.out.println (beverage1.getDescription() + "$" + beverage1.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Soy(beverage2);

        System.out.println (beverage2.getDescription() + "$" + beverage2.cost());
    }
}
