package patterncommand;

/**
 * Project: PatternsBook
 * Date: 06.09.13
 * Time: 0:30
 *
 * @author Skurishin Vladislav
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.open();
    }

    @Override
    public void undo() {
        garageDoor.close();
    }
}
