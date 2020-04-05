package com.github.structure.flyweight;

public class ConcreteWebSite extends WebSite {

    private String type = "";

    public ConcreteWebSite(String type){
        this.type = type;
    }

    @Override
    public void used(User user) {
        System.out.println("user" + user.getName() + ", type:" + type);
    }
}
