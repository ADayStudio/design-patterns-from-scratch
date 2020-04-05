package com.github.action.mediator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

public class ConcreteMediator extends Mediator {

    // 用户集合
    private HashMap<String, User> userMap = new HashMap<>();
    // 消息集合
    private HashMap<String, String> messageMap = new HashMap<>();

    @Override
    public void Register(User user) {
        userMap.put(user.getName(), user);
    }

    @Override
    public void getMessage(User user, String message) {
        messageMap.put(user.getName(), message);
        System.out.println(LocalDate.now().format(DateTimeFormatter.ISO_DATE) + ": " + message);
    }

    @Override
    public void sendMessage() {
        messageMap.forEach((k, v) -> {System.out.println(v);});
    }
}
