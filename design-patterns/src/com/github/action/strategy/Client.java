package com.github.action.strategy;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        Strategy strategyA = new ConcreteStrategyA();
        Strategy strategyB = new ConcreteStrategyB();

        Context context = new Context();
        context.handle();


        context.setStrategy(strategyA);
        context.handle();

        context.setStrategy(strategyB);
        context.handle();


        Integer[] data = {1, 5, 2};
        Arrays.sort(data, (v1, v2) -> {
            // 策略
            if(v1.compareTo(v2) > 0){
                return -1;
            }else {
                return 1;
            }
        });
    }
}
