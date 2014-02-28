package patterncommand.simple;

import patterncommand.Command;

/**
 * Project: PatternsBook
 * Date: 06.09.13
 * Time: 0:17
 *
 * @author Skurishin Vladislav
 */
public class SimpleRemoteControl {
    Command slot;

    public  SimpleRemoteControl() {}

    public void setCommand(Command command){
        slot = command;
    }

    public void buttonWasPressed(){
        slot.execute();
    }
}
