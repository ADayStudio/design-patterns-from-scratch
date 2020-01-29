package com.github.structure.decorator;

/**
 * 装饰者
 */
public class Decorator extends Drink{

    // 被装饰者
    private Drink drink;

    public Decorator(Drink drink){
        this.drink = drink;
    }

    //组合
    @Override
    public float cost() {
        return super.getPrice() + drink.getPrice();
    }

    @Override
    public String getDesc() {
        return super.getDesc() + "+" + drink.getDesc();
    }
}
