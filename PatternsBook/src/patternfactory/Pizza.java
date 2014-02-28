package patternfactory;

import java.util.List;
import java.util.ArrayList;

/**
 * Project: PatternsBook
 * Date: 28.08.13
 * Time: 16:42
 *
 * @author Skurishin Vladislav
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    String veggis[];
    String cheese;
    String pepperoni;
    List toppings = new ArrayList();

   public abstract void prepare();
// {
//        System.out.println ("Preparing " + name);
//        System.out.println ("Tossings doght ... ");
//        System.out.println ("Adding sauce ...");
//        System.out.println ("Adding toppings: ");
//        for (int i = 0; i < toppings.size(); i ++){
//            System.out.println ("   " + toppings.get(i));
//        }
//    };

    public void bake(){
        System.out.println ("Bake for 25 minutes at 350");
    };

    public void cut(){
        System.out.println ("Cutting the pizza into diagonal slices");
    };

    public void box(){
        System.out.println ("Place pizza in official PizzaStore box");
    };

    public String getName(){
        return name;
    }
}
