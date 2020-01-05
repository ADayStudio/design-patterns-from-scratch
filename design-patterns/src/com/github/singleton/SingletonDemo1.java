package com.github.singleton;


public class SingletonDemo1 {

    public static void main(String args[]){
        Singleton1 instance1 = Singleton1.getInstance();
        Singleton1 instance2 = Singleton1.getInstance();
        System.out.println(instance1 == instance2);
    }
}

// 饿汉式(静态常量)
class Singleton1{

    // 1.私有化构造方法
    private Singleton1(){}

    // 2.静态变量
    private static final Singleton1 instance = new Singleton1();

    // 3.获取
    public static Singleton1 getInstance(){
        return instance;
    }

}