package com.github.action.memento;

public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("状态#1 攻击力 100");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态#2 攻击力 80");
        caretaker.add(originator.saveStateMemento());

        originator.setState("状态#3 攻击力 50");
        caretaker.add(originator.saveStateMemento());

        System.out.println("当前状态：" + originator.getState());
        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("恢复状态：" + originator.getState());
    }
}
