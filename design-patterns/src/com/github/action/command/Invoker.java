package com.github.action.command;

/**
 * 调用者
 */
public class Invoker {

    private Command[] onCommands;
    private Command[] offCommands;

    // 撤销命令
    private Command undoCommand;

    private static final int SIZE = 5;

    public Invoker() {
        onCommands = new Command[SIZE];
        offCommands = new Command[SIZE];
        for (int i = 0; i < SIZE; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int index, Command onCommand, Command offCommand){
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    public void on(int index){
        onCommands[index].execute();
        // 记录上次命令
        undoCommand = onCommands[index];
    }

    public void off(int index){
        offCommands[index].execute();
        // 记录上次命令
        undoCommand = offCommands[index];
    }

    // revert
    public void undo(){
        undoCommand.undo();
    }
}
