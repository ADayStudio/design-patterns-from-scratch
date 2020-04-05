package com.github.action.state;

public class DeadState extends AbstractThreadState{

    public DeadState() {
        this.threadStatus = ThreadStatusEnum.DEAD.getStatus();
        System.out.println("当前线程处于：" + ThreadStatusEnum.DEAD.getName());
    }
}
