package patterniterator;

/**
 * Project: PatternsBook
 * Date: 07.03.14
 * Time: 23:51
 *
 * @author Skurishin Vladislav
 */
public class MenuItem
{
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price)
    {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public boolean isVegetarian()
    {
        return vegetarian;
    }

    public double getPrice()
    {
        return price;
    }
}
