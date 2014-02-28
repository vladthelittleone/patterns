package patterncommand.hard;

import patterncommand.Command;
import patterncommand.NoCommand;

/**
 * Project: PatternsBook
 * Date: 06.09.13
 * Time: 0:49
 *
 * @author Skurishin Vladislav
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl(){
        onCommands = new Command[3];
        offCommands = new Command[3];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 3; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot){
        onCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void offButtonWasPushed(int slot){
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed(){
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++){
            stringBuffer.append("[slot " + i + "]" + onCommands[i].getClass().getName()
            + "   " + offCommands[i].getClass().getName() + "\n");
        }

        return stringBuffer.toString();
    }
}
