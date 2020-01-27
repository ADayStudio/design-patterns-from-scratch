package com.github.bridge;

public class Iphone implements Brand {
    @Override
    public void open() {
        System.out.println("Iphone open");
    }

    @Override
    public void close() {
        System.out.println("Iphone close");
    }

    @Override
    public void call() {
        System.out.println("Iphone call");
    }
}
