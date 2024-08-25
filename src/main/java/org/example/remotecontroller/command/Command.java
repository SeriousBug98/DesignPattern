package org.example.remotecontroller.command;

public interface Command {
    public void execute();

    public void undo();
}
