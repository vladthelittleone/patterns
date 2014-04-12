package patternstate.gumballwithpattern.state;

import patternstate.gumballwithpattern.GumballMachine;
import patternstate.gumballwithpattern.state.State;

/**
 * package: patternstate.gumballwithpattern
 * date: 12.04.14
 *
 * @author Skurishin Vladislav
 */
public class SoldOutState implements State
{
    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public String toString() {
        return "sold out";
    }
}