package patterncommand;

/**
 * Project: PatternsBook
 * Date: 06.09.13
 * Time: 0:30
 *
 * @author Skurishin Vladislav
 */
public class GarageDoor {
    private boolean isOpen;

    public void open(){
        System.out.println ("Garage door open");
        isOpen = true;
    }

    public void close(){
        System.out.println ("Garage door close");
        isOpen = false;
    }
}
