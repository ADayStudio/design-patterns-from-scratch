package com.github.action.state;

public abstract class AbstractThreadState implements ThreadState{

    protected int threadStatus = 0;

    public int getThreadStatus() {
        return threadStatus;
    }

    private static final RuntimeException EXCEPTION = new RuntimeException("cannot do it");

    /**
     * 抽象类默认实现
     */

    @Override
    public void start(ThreadContext context) { throw EXCEPTION; }

    @Override
    public void getCPU(ThreadContext context) { throw EXCEPTION; }

    @Override
    public void suspend(ThreadContext context) { throw EXCEPTION; }

    @Override
    public void resume(ThreadContext context) { throw EXCEPTION; }

    @Override
    public void stop(ThreadContext context) { throw EXCEPTION; }
}
