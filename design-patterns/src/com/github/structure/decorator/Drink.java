package com.github.structure.decorator;

/**
 * 整体抽象出来
 */
public abstract class Drink {

    public String desc;

    private float price = 0.0f;

    // 重点：计算费用，由子类实现
    public abstract float cost();

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
