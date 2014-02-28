package templatemethod;

/**
 * Project: PatternsBook
 * Date: 27.02.14
 * Time: 1:31
 *
 * Паттерн Шаблонный метод - задает "скелет" алгоритма в методе,
 * оставляя определение реализации некоторых шагов субклассам.
 * Субклассы могут определять некоторые части алгоритма без
 * изменения его структуры.
 *
 * @author Skurishin Vladislav
 */
public abstract class CaffeineBeverage {

    /**
     * Фишка паттерна:
     * - Метод prepareRecipe() описывает алгоритм. 
     * - Методы, одинаковые для разны реализаций, не abstract. 
     * - Методы, не одинаковые, abstract. 
     * - Сам метод алгоритма -prepareRecipe() объявляется как final,
     *   так как он указывает последовательность выполнения алгоритма и 
     *   не может быть изменен. 
     * - Можно указывать final методы.
     */
    final void prepareRecipe(){
        hello(); // обязательный для все субклассов.
        boilWater();  // одинаковые
        brew(); // не одинаковые
        pourInCup(); // одинаковые действия алгоритма приготовления для чая и кофе
        if (customerWantsCondiments()){ // метод перехватчик - с помощью которого можно опустить ненужные части алгоритма.
            addCondiments(); // не одинаковые
        }
    }

    private boolean customerWantsCondiments(){
        return true;
    }

    abstract void brew();

    abstract void addCondiments();

    public final void hello(){
        System.out.println("Hello!");
    }

    public void boilWater(){
        System.out.println("Boiling water");
    }

    public void pourInCup(){
        System.out.println("Pouring into cup");
    }
}
