package patternstate.gumballwithpattern.state;

import patternstate.gumballwithpattern.GumballMachine;
import patternstate.gumballwithpattern.state.State;

/**
 * package: patternstate.gumballwithpattern
 * date: 12.04.14
 *
 * @author Skurishin Vladislav
 */
public class NoQuarterState implements State
{
    GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

    public String toString() {
        return "waiting for quarter";
    }
}