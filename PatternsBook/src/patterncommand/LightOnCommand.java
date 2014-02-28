package patterncommand;

/**
 * Project: PatternsBook
 * Date: 06.09.13
 * Time: 0:14
 *
 * @author Skurishin Vladislav
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    /**
     * Главная фиха тут:
     * мы просто запускаем метод execute
     * даже не знаю, как он выполняется.
     * вместо Light можно подставить любой
     * класс реализуюший Command.
     */
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
