package com.github.action.mediator;

/**
 * 中介者
 */
public abstract class Mediator {

    // 将中介者对象，加入到集合中
    public abstract void Register(User user);


    public abstract void getMessage(User user, String message);

    public abstract void sendMessage();
}
