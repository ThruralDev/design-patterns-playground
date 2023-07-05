package com.example.designpatterns.behavioral.command.abstracto;

/**
 * Is responsible for initiating requests to receiver.
 */
public class Invoker {

    private Command command;

    /**
     * As pre-configuration made by a client to be executed.
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * On stored reference of command object.
     */
    public void executeCommand(){

        command.execute();
    }
}
