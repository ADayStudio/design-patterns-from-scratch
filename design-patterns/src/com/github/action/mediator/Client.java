package com.github.action.mediator;


public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        User xiaoming = new XiaoMing(mediator, "xiaoming");
        User xiaohong = new XiaoHong(mediator, "xiaohong");

        xiaoming.sendMessage("Hi, I am xiaoming!");
        xiaohong.sendMessage("Hi, I am xiaohong!");
    }
}
