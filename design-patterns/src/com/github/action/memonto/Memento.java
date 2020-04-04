package com.github.action.memonto;

/**
 * 备忘录对象，负责保存状态
 */
public class Memento {

    private String state;

    public String getState() {
        return state;
    }

    public Memento(String state) {
        this.state = state;
    }
}
