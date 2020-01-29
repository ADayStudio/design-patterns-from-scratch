package com.github.create.singleton;


public class SingletonDemo6 {

    public static void main(String args[]){
        Singleton6 instance1 = Singleton6.INSTANCE;
        Singleton6 instance6 = Singleton6.INSTANCE;
        System.out.println(instance1 == instance6);
    }
}

// 枚举
enum Singleton6{

    INSTANCE
}