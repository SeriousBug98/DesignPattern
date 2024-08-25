package org.example.remotecontroller;

import org.example.remotecontroller.command.*;
import org.example.remotecontroller.invoker.RemoteControl;
import org.example.remotecontroller.receiver.Light;
import org.example.remotecontroller.receiver.Stereo;
import org.example.remotecontroller.receiver.TV;

public class MacroRemoteLoader {
    public static void main(String[] args) {
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);

        RemoteControl remoteControl = new RemoteControl();
        Command[] commands = {lightOn, stereoOn, tvOn};

        MacroCommand macroRemote = new MacroCommand(commands);
        remoteControl.setCommand(0, macroRemote, null);
        remoteControl.onButtonWasPushed(0);
    }
}
