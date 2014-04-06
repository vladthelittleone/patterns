package patterncomposite.impl;

import patterncomposite.iterators.CompositeIterator;
import patterncomposite.MenuComponent;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * package: patterncomposite
 * date: 05.04.14
 *
 * @author Skurishin Vladislav
 */
public class Menu extends MenuComponent
{
    Iterator<MenuComponent> iterator = null;
    ArrayList<MenuComponent> menuComponents = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent)
    {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent)
    {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i)
    {
        return menuComponents.get(i);
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String getDescription()
    {
        return description;
    }


    // Применение самого паттерна
    @Override
    public void print()
    {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("----------------------");
        for (Object menuComponent1 : menuComponents) {
            MenuComponent menuComponent =
                    (MenuComponent) menuComponent1;
            menuComponent.print();
        }
    }

    @Override
    public Iterator<MenuComponent> createIterator()
    {
        if (iterator == null) {
            iterator = new CompositeIterator(menuComponents.iterator());
        }

        return iterator;
    }
}
