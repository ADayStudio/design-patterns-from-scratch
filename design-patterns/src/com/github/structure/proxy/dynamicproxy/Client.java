package com.github.structure.proxy.dynamicproxy;


public class Client {

    public static void main(String[] args) {
        TeacherDao target = new TeacherDaoImpl();
        TeacherDao proxy = (TeacherDao)new ProxyFactory(target).getProxyInstance();
        // 通过代理对象，调用目标对象的方法
        proxy.teach();
    }
}
