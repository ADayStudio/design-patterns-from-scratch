package com.github.action.state;

public class Client {

    public static void main(String[] args) {
        ThreadContext thread = new ThreadContext();
        thread.start();
        thread.getCPU();
        thread.suspend();
        thread.resume();
        thread.getCPU();
        thread.stop();
    }
}
