package org.example.remotecontroller.command;

import org.example.remotecontroller.receiver.GarageDoor;

public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.lightOn();
        garageDoor.stop();
    }

    @Override
    public void undo() {
        garageDoor.down();
        garageDoor.lightOff();
        garageDoor.stop();
    }
}
