package com.github.action.strategy;

public class Context {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public Context() {}

    public void handle(){
        // 也可用空对象模式
        if (null == strategy){
            System.out.println("default");
        }else {
        strategy.handle();
        }
    }
}
