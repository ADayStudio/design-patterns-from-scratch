package com.github.singleton;


public class SingletonDemo2 {

    public static void main(String args[]){
        Singleton2 instance1 = Singleton2.getInstance();
        Singleton2 instance2 = Singleton2.getInstance();
        System.out.println(instance1 == instance2);
    }
}

// 饿汉式(静态块)
class Singleton2{

    // 1.私有化构造方法
    private Singleton2(){}

    private static Singleton2 instance;

    // 2.静态块
    static {
        instance = new Singleton2();
    }

    // 3.获取
    public static Singleton2 getInstance(){
        return instance;
    }

}