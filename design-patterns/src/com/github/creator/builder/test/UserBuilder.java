package com.github.creator.builder.test;

/**
 * builder
 */
public class UserBuilder extends Builder{

    private static User user;

    public UserBuilder(User user){
        this.user = user;
    }

    public UserBuilder username(String username) {
        user.setUsername(username);
        return this;
    }

    public UserBuilder desc(String desc) {
        user.setDesc(desc);
        return this;
    }

    public User build(){
        return user;
    }
}
