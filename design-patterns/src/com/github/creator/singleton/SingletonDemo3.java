package com.github.creator.singleton;


public class SingletonDemo3 {

    public static void main(String args[]){
        Singleton3 instance1 = Singleton3.getInstance();
        Singleton3 instance3 = Singleton3.getInstance();
        System.out.println(instance1 == instance3);
    }
}

// 懒汉式(同步方法)
class Singleton3{

    // 1.私有化构造方法
    private Singleton3(){}

    private static Singleton3 instance;

    // 2.获取
    public static synchronized Singleton3 getInstance(){
        if (instance == null) {
                instance = new Singleton3();
        }
        return instance;
    }

}