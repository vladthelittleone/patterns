package patternsingleton;

/**
 * Project: PatternsBook
 * Date: 29.08.13
 * Time: 16:34
 *
 * @author Skurishin Vladislav
 */
public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton(){};

    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }

        return  uniqueInstance;
    }
}
