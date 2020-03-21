package com.github.action.visitor;

public class Man extends Person {

    public Man(String name) {
        super(name);
    }

    /**
     * 双分派
     * Man在Action中作为参数传递(第一次分派)
     * Man在方法中调用Action，同时将自己(this)作为参数传入(第二次分派)
     */
    @Override
    public void accept(Action action) {
        action.getResultMan(this);
    }
}
