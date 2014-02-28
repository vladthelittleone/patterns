package patterncommand.hard;

import patterncommand.*;

/**
 * Project: PatternsBook
 * Date: 06.09.13
 * Time: 1:03
 *
 * @author Skurishin Vladislav
 *
 * Паттерн Команда:
 * инкапсулирует запрос в виде объекта, делая
 * возможным параметризацию клиентских объектов
 * с другими запросами, организацию очереди или
 * регистрацию запросов, а так же поддержку отмены операций.
 *
 * Реализуем пульт из шести кнопок:
 * Первая вкл. / выкл. свет,
 * Третья открыть / закрыть гараж,
 * Четвертая вкл. / выкл. стерео.
 *
 * Советую посмотреть реализацию CeilingFanGighCommand
 * и MacroCommand
 */
public class RemoteLoader {
    public static void main(String args[]) {
        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo();

        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageClose = new GarageDoorCloseCommand(garageDoor);
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        StereoOff stereoOff = new StereoOff(stereo);

        remoteControl.setCommand(0, lightOn, lightOff);
        remoteControl.setCommand(1, garageOpen, garageClose);
        remoteControl.setCommand(2, stereoOn, stereoOff);

        System.out.println (remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.undoButtonWasPushed();
    }
}
