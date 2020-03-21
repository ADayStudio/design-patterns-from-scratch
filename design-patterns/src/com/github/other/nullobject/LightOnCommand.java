package com.github.other.nullobject;

public class LightOnCommand implements Command {

    @Override
    public void execute() {
        System.out.println("light on");
    }

    @Override
    public void undo() {
        System.out.println("light off");
    }
}
