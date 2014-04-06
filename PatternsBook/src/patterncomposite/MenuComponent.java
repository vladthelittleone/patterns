package patterncomposite;

/**
 * package: patterniterator
 * date: 05.04.14
 *
 * MenuItem и класс Menu не переопределяют некоторые методы в связи с тем,
 * что не имеют такой функциональности. Но рискую безопасностью, мы получаем прозрачность
 * (не нужно вызывать instanceof, чтобы определить меню этот или подменю).
 * @author Skurishin Vladislav
 */
public abstract class MenuComponent
{
    public void add(MenuComponent menuComponent)
    {
        throw new UnsupportedOperationException();
    }

    public void remove(MenuComponent menuComponent)
    {
        throw new UnsupportedOperationException();
    }

    public MenuComponent getChild(int i)
    {
        throw new UnsupportedOperationException();
    }

    public String getName()
    {
        throw new UnsupportedOperationException();
    }

    public String getDescription()
    {
        throw new UnsupportedOperationException();
    }

    public double getPrice()
    {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian()
    {
        throw new UnsupportedOperationException();
    }

    public void print()
    {
        throw new UnsupportedOperationException();
    }

    public java.util.Iterator<MenuComponent> createIterator()
    {
        throw new UnsupportedOperationException();
    }
}
