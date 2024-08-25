package org.example.remotecontroller.command;

import org.example.remotecontroller.receiver.TV;

public class TVOffCommand implements Command{
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
