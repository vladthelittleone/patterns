package patterncommand;

/**
 * Project: PatternsBook
 * Date: 06.09.13
 * Time: 0:15
 *
 * @author Skurishin Vladislav
 */
public class Light {
    private boolean isOn;
    public void on(){
        System.out.println("Light On");
        isOn = true;
    }

    public void off(){
        System.out.println("Light Off");
        isOn = false;
    }
}
