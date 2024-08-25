package org.example.remotecontroller;

import org.example.remotecontroller.command.*;
import org.example.remotecontroller.invoker.RemoteControl;
import org.example.remotecontroller.receiver.CeilingFan;
import org.example.remotecontroller.receiver.GarageDoor;
import org.example.remotecontroller.receiver.Light;
import org.example.remotecontroller.receiver.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
//        RemoteControl remoteControl = new RemoteControl();
//
//        Light livingRommLight = new Light("Living Room");
//        Light kitchenLight = new Light("Kitchen");
//        CeilingFan ceilingFan = new CeilingFan("Living Room");
//        GarageDoor garageDoor = new GarageDoor("Garage");
//        Stereo stereo = new Stereo("Living Room");
//
//        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRommLight);
//        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRommLight);
//        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
//        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
//
//        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
//        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
//
//        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
//        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
//
//        StereoOnWithCDCommand stereoOnWithCd = new StereoOnWithCDCommand(stereo);
//        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo);
//
//        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
//        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
//        remoteControl.setCommand(3, stereoOnWithCd, stereoOffCommand);
//
//        System.out.println("remoteControl = " + remoteControl);
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.onButtonWasPushed(1);
//        remoteControl.offButtonWasPushed(1);
//        remoteControl.onButtonWasPushed(2);
//        remoteControl.offButtonWasPushed(2);
//        remoteControl.onButtonWasPushed(3);
//        remoteControl.offButtonWasPushed(3);

        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();
    }
}
