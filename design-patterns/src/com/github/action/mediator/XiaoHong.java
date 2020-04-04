package com.github.action.mediator;

public class XiaoHong extends User {

    public XiaoHong(Mediator mediator, String name) {
        super(mediator, name);
        mediator.Register(this);
    }

    @Override
    public void sendMessage(String message) {
        this.getMediator().getMessage(this, message);
    }
}
