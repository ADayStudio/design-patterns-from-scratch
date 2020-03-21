package com.github.other.nullobject;

/**
 * 命令
 */
public interface Command {

    /**
     * 执行
     */
    void execute();

    /**
     * 撤销
     */
    void undo();
}
