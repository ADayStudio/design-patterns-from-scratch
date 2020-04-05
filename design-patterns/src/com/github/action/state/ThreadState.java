package com.github.action.state;

public interface ThreadState {

    void start(ThreadContext context);
    void getCPU(ThreadContext context);
    void suspend(ThreadContext context);
    void resume(ThreadContext context);
    void stop(ThreadContext context);
}
