package com.github.action.state;

/**
 * 上下文 环境类
 */
public class ThreadContext{

    private AbstractThreadState state;

    // 读取状态
    public int getThreadStatus() { return state.getThreadStatus(); }

    // 设置状态
    public void setState(AbstractThreadState state) { this.state = state; }

    // 初始化状态
    public ThreadContext() { this.state = new NewState(); }

    public void start() { state.start(this); }

    public void getCPU() { state.getCPU(this); }

    public void suspend() { state.suspend(this); }

    public void resume() { state.resume(this); }

    public void stop() { state.stop(this); }
}
