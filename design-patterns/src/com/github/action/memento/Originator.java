package com.github.action.memento;

/**
 * 需要保存状态的对象
 */
public class Originator {
    // 状态信息
    private String state;

    // 保存一个状态对象
    public Memento saveStateMemento(){
        return new Memento(state);
    }

    // 通过备忘录对象，恢复状态
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
