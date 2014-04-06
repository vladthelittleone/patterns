package patterniterator.realisations;

import patterniterator.Menu;
import patterncomposite.impl.MenuItem;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Project: PatternsBook
 * Date: 07.03.14
 * Time: 23:56
 *
 * Реализация меню блинной.
 * @author Skurishin Vladislav
 */
public class PancakeHouseMenu implements Menu
{
    // !!!Проблема!!!
    // Для перебора DinerMenu и PancakeHouseMenu
    // понадобится 2 цикла, поэтому лучше использовать
    // паттерн итератор.
    private ArrayList<MenuItem> menuItems;

    public PancakeHouseMenu()
    {
        menuItems = new ArrayList<>();

        addItem("K&B's breakfast.",
                "With eggs and toast.",
                true,
                2.99);

        addItem("Regular breakfast.",
                "With eggs and sausage.",
                false,
                2.99);

        addItem("Blueberry breakfast.",
                "Fresh blueberry.",
                true,
                3.49);

        addItem("Waffles.",
                "With strawberries and blueberries.",
                true,
                3.59);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    /**
     * Создает итератор для коллекции.
     */
    public Iterator<MenuItem> createIterator()
    {
        return menuItems.iterator();
    }

//    Удаляем так как был создан итератор.
//
//    public MenuItem[] getMenuItems()
//    {
//        return menuItems;
//    }

//    другие методы

    // другие методы
}
