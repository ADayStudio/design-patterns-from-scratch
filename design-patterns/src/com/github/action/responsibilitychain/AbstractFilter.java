package com.github.action.responsibilitychain;

/**
 * 处理者
 */
public abstract class AbstractFilter {

    protected String name;

    // 下一个处理者，形成链式
    AbstractFilter filter;

    public AbstractFilter(String name) {
        this.name = name;
    }

    public void setFilter(AbstractFilter filter) {
        this.filter = filter;
    }

    public abstract void handler(MyRequest request);
}
