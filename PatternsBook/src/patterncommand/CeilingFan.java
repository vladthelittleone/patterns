package patterncommand;

/**
 * Project: PatternsBook
 * Date: 06.09.13
 * Time: 1:24
 *
 * @author Skurishin Vladislav
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 3;
    public static final int LOW = 3;
    public static final int OFF = 3;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void high(){
        speed = HIGH;
    }

    public void medium(){
        speed = MEDIUM;
    }

    public void low(){
        speed = LOW;
    }

    public void off(){
        speed = OFF;
    }

    public int getSpeed(){
        return speed;
    }
}
