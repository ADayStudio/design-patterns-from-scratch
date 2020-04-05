package com.github.action.state;

public class RunningState extends AbstractThreadState{

    public RunningState() {
        this.threadStatus = ThreadStatusEnum.RUNNING.getStatus();
        System.out.println("当前线程处于：" + ThreadStatusEnum.RUNNING.getName());
    }

    /**
     * 暂停
     */
    public void suspend(ThreadContext context) {
        if (ThreadStatusEnum.RUNNING.getStatus() == context.getThreadStatus()){
            System.out.println("suspend() ->" + ThreadStatusEnum.BLOCKED.getName());
            context.setState(new BlockedState());
        }else {
            System.out.println("cannot suspend");
        }
    }

    /**
     * 停止
     */
    public void stop(ThreadContext context) {
        if (ThreadStatusEnum.RUNNING.getStatus() == context.getThreadStatus()){
            System.out.println("stop() ->" + ThreadStatusEnum.DEAD.getName());
            context.setState(new DeadState());
        }else {
            System.out.println("cannot stop");
        }
    }
}
