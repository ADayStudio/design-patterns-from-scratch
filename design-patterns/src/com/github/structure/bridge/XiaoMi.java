package com.github.structure.bridge;

public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("Xiaomi open");
    }

    @Override
    public void close() {
        System.out.println("Xiaomi close");
    }

    @Override
    public void call() {
        System.out.println("Xiaomi call");
    }
}
