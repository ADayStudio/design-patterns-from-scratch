package com.github.action.state;

public class BlockedState extends AbstractThreadState{

    public BlockedState() {
        this.threadStatus = ThreadStatusEnum.BLOCKED.getStatus();
        System.out.println("当前线程处于：" + ThreadStatusEnum.BLOCKED.getName());
    }

    /**
     * 恢复
     */
    public void resume(ThreadContext context) {
        if (ThreadStatusEnum.BLOCKED.getStatus() == context.getThreadStatus()){
            System.out.println("resume() ->" + ThreadStatusEnum.BLOCKED.getName());
            context.setState(new RunningState());
        }else {
            System.out.println("cannot resume");
        }
    }
}
