package com.github.action.strategy;

public class ConcreteStrategyB implements Strategy{

    @Override
    public void handle() {
        System.out.println("strategy B");
    }
}
