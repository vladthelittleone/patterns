package templatemethod;

/**
 * Project: PatternsBook
 * Date: 27.02.14
 * Time: 1:19
 *
 * @author Skurishin Vladislav
 */
public class Coffe extends CaffeineBeverage {

    @Override
    public void brew(){
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    public void addCondiments(){
        System.out.println("Adding Sugar and Milk");
    }
}
