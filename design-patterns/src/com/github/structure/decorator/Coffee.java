package com.github.structure.decorator;

/**
 * 被装饰者
 */
public class Coffee extends Drink{

    @Override
    public float cost() {
        return super.getPrice();
    }
}
