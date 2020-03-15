package com.github.creator.singleton;


public class SingletonDemo4 {

    public static void main(String args[]){
        Singleton4 instance1 = Singleton4.getInstance();
        Singleton4 instance4 = Singleton4.getInstance();
        System.out.println(instance1 == instance4);
    }
}

// 双重检查(同步代码块)
class Singleton4{

    // 1.私有化构造方法
    private Singleton4(){}

    private static volatile Singleton4 instance;

    // 2.获取
    public static Singleton4 getInstance(){
        if (instance == null) {
            synchronized (Singleton4.class){
                if (instance == null) {
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }

}