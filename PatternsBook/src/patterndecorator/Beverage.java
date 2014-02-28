package patterndecorator;

/**
 * Project: PatternsBook
 * Date: 27.08.13
 * Time: 20:14
 *
 * @author Skurishin Vladislav
 *
 * Паттерн Декоратор:
 * динамически наделяет объект новыми
 * возможностями и является гибкой альтернативой субклассированию
 *
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
