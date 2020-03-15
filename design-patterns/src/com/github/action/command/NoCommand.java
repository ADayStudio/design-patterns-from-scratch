package com.github.action.command;

/**
 * 没有任何命令，空执行，用于初始化。
 * 可以省略对空的判断
 */
public class NoCommand implements Command{

    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}
