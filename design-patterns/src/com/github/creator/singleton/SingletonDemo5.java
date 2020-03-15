package com.github.creator.singleton;


public class SingletonDemo5 {

    public static void main(String args[]){
        Singleton5 instance1 = Singleton5.getInstance();
        Singleton5 instance5 = Singleton5.getInstance();
        System.out.println(instance1 == instance5);
    }
}

// 静态内部类
class Singleton5{

    // 1.私有化构造方法
    private Singleton5(){}

    // 2.静态内部类(外部类被加载时候，静态内部类不会被加载)
    private static class SingletonInstance{
        private static final Singleton5 instance = new Singleton5();
    }

    // 3.获取
    public static Singleton5 getInstance(){
        return SingletonInstance.instance;
    }

}