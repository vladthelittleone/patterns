package patternsingleton;

/**
 * Project: PatternsBook
 * Date: 29.08.13
 * Time: 16:48
 *
 * @author Skurishin Vladislav
 *
 * Паттерн одиночка:
 * Гарантирует, что класс имеет только один экземпляр, и
 * предоставляет глобальную точку доступа к этому экземпляру.
 *
 * Реализована потокобезопастность.
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;

    private volatile static ChocolateBoiler instance;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance(){
        if (instance == null){
            synchronized (ChocolateBoiler.class){
                if (instance == null){
                    instance = new ChocolateBoiler();
                }
            }
        }
        return instance;
    }

    public void fill(){
        if (isEmpty()){
            boiled = false;
            empty = false;
        }
    }

    public void drain(){
        if (!isEmpty() && isBoiled()){
            empty = true;
        }
    }

    public void boil(){
        if (!isEmpty() && !isBoiled()){
            boiled = true;
        }
    }

    public boolean isEmpty(){
        return empty;
    }

    public boolean isBoiled(){
        return boiled;
    }
}
