package org.example.remotecontroller;

import org.example.remotecontroller.command.GarageDoorOpenCommand;
import org.example.remotecontroller.command.LightOnCommand;
import org.example.remotecontroller.invoker.SimpleRemoteControl;
import org.example.remotecontroller.receiver.GarageDoor;
import org.example.remotecontroller.receiver.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl(); // 인보커
        Light light = new Light("그냥 조명"); // 리시버
        LightOnCommand lightOn = new LightOnCommand(light); // 커맨드 객체
        GarageDoor garageDoor = new GarageDoor("그냥 차고");
        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageDoorOpen);
        remote.buttonWasPressed();
    }
}
