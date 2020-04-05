package com.github.action.state;

public class RunnableState extends AbstractThreadState{

    public RunnableState() {
        this.threadStatus = ThreadStatusEnum.RUNNABLE.getStatus();
        System.out.println("当前线程处于：" + ThreadStatusEnum.RUNNABLE.getName());
    }

    /**
     * 获取CPU分配
     */
    public void getCPU(ThreadContext context) {
        if (ThreadStatusEnum.RUNNABLE.getStatus() == context.getThreadStatus()){
            System.out.println("getCPU() ->" + ThreadStatusEnum.RUNNING.getName());
            context.setState(new RunningState());
        }else {
            System.out.println("cannot getCPU");
        }
    }

}
