package com.github.action.mediator;

public class XiaoMing extends User {

    public XiaoMing(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(this);
    }

    @Override
    public void sendMessage(String message) {
        this.getMediator().getMessage(this, message);
    }
}
