package com.github.create.builder.test;

/**
 * Product
 */
public class User {

    private String username;

    private String desc;

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public User setDesc(String desc) {
        this.desc = desc;
        return this;
    }

    public static Builder builder(){
        return new UserBuilder(new User());
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
