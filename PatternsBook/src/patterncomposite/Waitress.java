package patterncomposite;

import patterncomposite.impl.MenuItem;

import java.util.Iterator;

/**
 * Project: PatternsBook
 * Date: 08.03.14
 * Time: 20:35
 *
 * Официант, который обслуживает меню.
 * @author Skurishin Vladislav
 */
public class Waitress
{
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus){
        this.allMenus = allMenus;
    }

    /**
     * Показываем меню.
     */
    public void printMenu(){
        allMenus.print();
    }

    private void printMenu(Iterator<MenuItem> iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + " ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        System.out.println("\nVEGETARIAN MENU\n----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent =
                    iterator.next();
            try {
                if (menuComponent.isVegetarian()){
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {} // перехват не поддерж. операций.
        }
    }
}
