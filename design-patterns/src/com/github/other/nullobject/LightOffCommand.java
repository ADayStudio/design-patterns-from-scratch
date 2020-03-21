package com.github.other.nullobject;

public class LightOffCommand implements Command {

    @Override
    public void execute() {
        System.out.println("light off");
    }

    @Override
    public void undo() {
        System.out.println("light on");
    }
}
