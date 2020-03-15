package com.github.action.command;

public class LightOffCommand implements Command{

    private LightReceiver receiver;

    public LightOffCommand(LightReceiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.off();
    }

    @Override
    public void undo() {
        receiver.on();
    }
}
