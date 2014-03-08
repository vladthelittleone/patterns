package patterniterator;

import patterniterator.realisations.DinerMenu;
import patterniterator.realisations.PancakeHouseMenu;

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
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    /**
     * Показываем меню.
     */
    public void printMenu(){
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("\nLUNCH");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator){
        while (iterator.hasNext()){
            MenuItem menuItem = iterator.next();
            System.out.print(menuItem.getName() + " ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }
}
