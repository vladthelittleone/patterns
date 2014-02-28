package patterncommand;

/**
 * Project: PatternsBook
 * Date: 06.09.13
 * Time: 0:58
 *
 * @author Skurishin Vladislav
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
