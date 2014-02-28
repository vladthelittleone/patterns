package patterncommand;

/**
 * Project: PatternsBook
 * Date: 06.09.13
 * Time: 1:33
 *
 * @author Skurishin Vladislav
 */
public class MacroCommand implements Command {
    Command[] commands;

    public MacroCommand(Command[] commands){
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++){
            commands[i].execute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i++){
            commands[i].undo();
        }
    }
}
