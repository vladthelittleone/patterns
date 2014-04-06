package patterncomposite.iterators;

import patterncomposite.MenuComponent;
import patterncomposite.impl.Menu;

import java.util.Iterator;
import java.util.Stack;

/**
 * package: patterncomposite.impl
 * date: 06.04.14
 *
 * Еще одна реализация паттерна композиции с внешним Iterator'ом.
 * @author Skurishin Vladislav
 */
public class CompositeIterator implements Iterator<MenuComponent>
{
    private Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator<MenuComponent> iterator)
    {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext()
    {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public MenuComponent next()
    {
        if (hasNext()) {
            Iterator<MenuComponent> iterator = stack.peek();
            MenuComponent component = iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        } else {
            return null;
        }
    }

    @Override
    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
