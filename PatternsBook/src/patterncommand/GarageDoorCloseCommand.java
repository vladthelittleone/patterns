package patterncommand;

/**
 * Project: PatternsBook
 * Date: 06.09.13
 * Time: 1:09
 *
 * @author Skurishin Vladislav
 */
public class GarageDoorCloseCommand implements Command {

    GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.close();
    }

    @Override
    public void undo() {
        garageDoor.open();
    }
}
