package patternstate.gumballwithpattern.state;

import patternstate.gumballwithpattern.GumballMachine;
import patternstate.gumballwithpattern.state.State;

/**
 * package: patternstate.gumballwithpattern
 * date: 12.04.14
 *
 * Легко добавляем новую реализацию новое состояние.
 * @author Skurishin Vladislav
 */
public class WinnerState implements State
{
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a Gumball");
    }

    public void ejectQuarter() {
        System.out.println("Please wait, we're already giving you a Gumball");
    }

    public void turnCrank() {
        System.out.println("Turning again doesn't get you another gumball!");
    }

    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    public String toString() {
        return "dispensing two gumballs for your quarter, because YOU'RE A WINNER!";
    }
}
