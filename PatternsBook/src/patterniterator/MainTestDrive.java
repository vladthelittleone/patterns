package patterniterator;

import patterniterator.realisations.DinerMenu;
import patterniterator.realisations.PancakeHouseMenu;

/**
 * Project: PatternsBook
 * Date: 08.03.14
 * Time: 20:42
 * <p/>
 * Имеются две реализации меню. В одной из реализаций
 * импользуется Array, а в другой {@link java.util.ArrayList}.
 * В результате для перебора элементов необходимо два цикла, клиентский
 * код привязан к конкретным классам, несмотря на полное совпадение
 * интерфейсов, плохая инкапсуляция работы меню.
 * <p/>
 * Поэтому мы создаем {@link java.util.Iterator}
 * (не юзаем java-реализацию для самостоятельного разбора).
 *
 * @author Skurishin Vladislav
 */
public class MainTestDrive
{
    public static void main(String[] args)
    {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
