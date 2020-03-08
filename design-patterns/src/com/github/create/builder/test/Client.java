package com.github.create.builder.test;

public class Client {

    public static void main(String[] args) {
        User user = User.builder().username("Akane").desc("builder").build();
        System.out.println(user);
    }
}
