package patternadaptations.adapter;

/**
 * Project: PatternsBook
 * Date: 26.09.13
 * Time: 0:00
 *
 * @author Skurishin Vladislav
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println ("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println ("I'm flying a short distance");
    }
}
