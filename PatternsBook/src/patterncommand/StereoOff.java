package patterncommand;

/**
 * Project: PatternsBook
 * Date: 06.09.13
 * Time: 1:09
 *
 * @author Skurishin Vladislav
 */
public class StereoOff implements Command {
    Stereo stereo;

    public StereoOff(Stereo stereo) {
        this.stereo = stereo;
    }


    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setValume(11);
    }
}
