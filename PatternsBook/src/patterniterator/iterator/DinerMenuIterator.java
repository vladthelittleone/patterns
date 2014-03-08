package patterniterator.iterator;

import patterniterator.MenuItem;

import java.util.Iterator;

/**
 * Project: PatternsBook
 * Date: 08.03.14
 * Time: 20:19
 *
 * @author Skurishin Vladislav
 */
public class DinerMenuIterator implements Iterator<MenuItem>
{
    private MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items)
    {
        this.items = items;
    }

    @Override
    public boolean hasNext()
    {
        return !(position >= items.length || items[position] == null);
    }

    @Override
    public MenuItem next()
    {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
