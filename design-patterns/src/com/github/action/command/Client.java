package com.github.action.command;

public class Client {

    public static void main(String[] args) {

        LightReceiver receiver = new LightReceiver();
        Command lightOnCommand = new LightOnCommand(receiver);
        Command lightOffCommand = new LightOffCommand(receiver);

        Invoker invoker = new Invoker();
        invoker.setCommand(0, lightOnCommand, lightOffCommand);
        invoker.on(0);
        invoker.off(0);
        invoker.undo();
    }
}
