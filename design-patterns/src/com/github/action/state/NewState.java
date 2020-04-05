package com.github.action.state;

public class NewState extends AbstractThreadState{

    public NewState() {
        this.threadStatus = ThreadStatusEnum.START.getStatus();
        System.out.println("当前线程处于：" + ThreadStatusEnum.START.getName());
    }

    /**
     * 开始
     */
    @Override
    public void start(ThreadContext context) {
        if (ThreadStatusEnum.START.getStatus() == context.getThreadStatus()){
            System.out.println("start() ->" + ThreadStatusEnum.RUNNABLE.getName());
            context.setState(new RunnableState());
        }else {
            System.out.println("cannot start");
        }
    }
}
