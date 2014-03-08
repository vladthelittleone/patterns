package patterniterator.realisations;

import patterniterator.Menu;
import patterniterator.MenuItem;
import patterniterator.iterator.DinerMenuIterator;

import java.util.Iterator;

/**
 * Project: PatternsBook
 * Date: 08.03.14
 * Time: 20:01
 * <p/>
 * Реализация меню бистро.
 *
 * @author Skurishin Vladislav
 */
public class DinerMenu implements Menu
{
    private static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    /**
     * !!!Проблема!!!
     * Для перебора DinerMenu и PancakeHouseMenu
     * понадобится 2 цикла, поэтому лучше использовать
     * паттерн итератор.
     *
     * @see patterniterator.iterator.DinerMenuIterator
     * @see java.util.Iterator
     */
    private MenuItem[] menuItems;

    public DinerMenu()
    {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT.",
                "With lettuce and tomato.",
                true,
                2.99);

        addItem("BLT.",
                "With lettuce and tomato.",
                false,
                2.99);

        addItem("Soup.",
                "With side of potato salad.",
                false,
                3.29);

        addItem("Hotdog.",
                "With relish.",
                true,
                3.05);
    }

    /**
     * Создает итератор для коллекции.
     */
    public Iterator<MenuItem> createIterator()
    {
        return new DinerMenuIterator(menuItems);
    }

    public void addItem(String name, String description,
                        boolean vegetarian, double price)
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS)
        {
            System.err.println("Sorry, menu is full");
        } else
        {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }

//    Удаляем так как был создан итератор.
//
//    public MenuItem[] getMenuItems()
//    {
//        return menuItems;
//    }

//    другие методы
}
