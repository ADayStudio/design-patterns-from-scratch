package com.github.creator.builder;

public class Client {

    public static void main(String args[]) {
        Builder builder = new MacBookBuilder();

        Director director = new Director(builder);
        director.construct("英特尔主板", "Retina显示器");

        Computer macBook = builder.build();
    }
}
