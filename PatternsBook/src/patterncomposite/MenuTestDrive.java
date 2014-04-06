package patterncomposite;

import patterncomposite.impl.Menu;
import patterncomposite.impl.MenuItem;

/**
 * package: patterncomposite
 * date: 06.04.14
 *
 * @author Skurishin Vladislav
 */
public class MenuTestDrive
{
    public static void main(String[] args)
    {
        MenuComponent pancake = new Menu("Pancake", "Breakfast");
        MenuComponent diner = new Menu("Diner", "Lunch");

        MenuComponent allMenus = new Menu("All menus", "combined");

        allMenus.add(pancake);
        allMenus.add(diner);

        diner.add(new MenuItem("Pasts", "Spaghetti", true, 3.89));
        diner.add(pancake);

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
