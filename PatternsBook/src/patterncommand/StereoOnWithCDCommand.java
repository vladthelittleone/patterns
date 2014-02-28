package patterncommand;

/**
 * Project: PatternsBook
 * Date: 06.09.13
 * Time: 1:01
 *
 * @author Skurishin Vladislav
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }


    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setValume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
