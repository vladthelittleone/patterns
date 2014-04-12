package patternstate.gumballwithpattern.state;

/**
 * package: patternstate.gumballwithpattern
 * date: 12.04.14
 *
 * @author Skurishin Vladislav
 */
public interface State {
    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();
}

