package com.github.structure.proxy.staticproxy;


public class Client {

    public static void main(String[] args) {
        TeachDaoProxy proxy = new TeachDaoProxy(new TeacherDaoImpl());
        // 通过代理对象，调用被代理对象的方法
        proxy.teach();
    }
}
