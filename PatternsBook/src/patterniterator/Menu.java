package patterniterator;

import java.util.Iterator;

/**
 * Project: PatternsBook
 * Date: 08.03.14
 * Time: 20:59
 *
 * @author Skurishin Vladislav
 */
public interface Menu
{
    public Iterator<MenuItem> createIterator();
}
