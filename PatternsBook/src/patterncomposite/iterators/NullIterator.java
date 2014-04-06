package patterncomposite.iterators;

import patterncomposite.MenuComponent;

import java.util.Iterator;

/**
 * package: patterncomposite.impl
 * date: 06.04.14
 *
 * @author Skurishin Vladislav
 */
public class NullIterator implements Iterator<MenuComponent>
{
    @Override
    public boolean hasNext()
    {
        return false;
    }

    @Override
    public MenuComponent next()
    {
        return null;
    }

    @Override
    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
