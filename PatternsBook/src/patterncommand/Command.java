package patterncommand;

/**
 * Project: PatternsBook
 * Date: 06.09.13
 * Time: 0:10
 *
 * @author Skurishin Vladislav
 */

public interface Command {
    /**
     * Главная фиха тут:
     * мы просто запускаем метод execute
     * даже не знаю, как он выполняется.
     * Можно подставить любой
     * класс реализуюший Command.
     */
    public void execute();
    public void undo();
}
