package com.github.action.mediator;

public abstract class User {

    private Mediator mediator;
    private String name;

    public User(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void sendMessage(String message);
}
