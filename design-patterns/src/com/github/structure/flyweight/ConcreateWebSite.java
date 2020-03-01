package com.github.structure.flyweight;

public class ConcreateWebSite extends WebSite {

    private String type = "";

    public ConcreateWebSite(String type){
        this.type = type;
    }

    @Override
    public void used(User user) {
        System.out.println("user" + user.getName() + ", type:" + type);
    }
}
