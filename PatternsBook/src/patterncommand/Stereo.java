package patterncommand;

/**
 * Project: PatternsBook
 * Date: 06.09.13
 * Time: 0:59
 *
 * @author Skurishin Vladislav
 */
public class Stereo {
    private boolean isOn;
    private boolean isCDSet;
    private int valume;

    public void on(){
        System.out.println ("Stereo On");
        isOn = true;
    }

    public void off(){
        System.out.println ("Stereo Off");
        isOn = false;
    }

    public void setCD(){
        isCDSet = true;
    }

    public void setValume(int i){
        valume = i;
    }
}
