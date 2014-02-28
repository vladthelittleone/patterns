package patterncommand.simple;

import patterncommand.GarageDoor;
import patterncommand.GarageDoorOpenCommand;
import patterncommand.Light;
import patterncommand.LightOnCommand;

/**
 * Project: PatternsBook
 * Date: 06.09.13
 * Time: 0:21
 *
 * @author Skurishin Vladislav
 *
 * Паттерн Команда:
 * инкапсулирует запрос в виде объекта, делая
 * возможным параметризацию клиентских объектов
 * с другими запросами, организацию очереди или
 * регистрацию запросов, а так же поддержку отмены операций.
 *
 */
public class RemoteControlTest {
    public static void main(String args[]){
        SimpleRemoteControl remoteControl = new SimpleRemoteControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        LightOnCommand lightOn = new LightOnCommand(light);

        remoteControl.setCommand(lightOn);
        remoteControl.buttonWasPressed();
        remoteControl.setCommand(garageOpen);
        remoteControl.buttonWasPressed();
    }
}
