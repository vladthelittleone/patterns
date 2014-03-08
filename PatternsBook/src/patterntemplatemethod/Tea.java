package patterntemplatemethod;

/**
 * Project: PatternsBook
 * Date: 27.02.14
 * Time: 1:30
 *
 * @author Skurishin Vladislav
 */
public class Tea extends CaffeineBeverage{

    @Override
    public void brew(){
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments(){
        System.out.println("Adding Sugar and Milk");
    }

}
