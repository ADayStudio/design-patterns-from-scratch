package com.github.action.strategy;

public class ConcreteStrategyA implements Strategy{

    @Override
    public void handle() {
        System.out.println("strategy A");
    }
}
