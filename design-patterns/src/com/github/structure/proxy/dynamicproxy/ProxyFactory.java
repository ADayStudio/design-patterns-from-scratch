package com.github.structure.proxy.dynamicproxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理对象
 * 动态代理，利用JDK的newProxyInstance方法，动态的在内存中构建代理对象
 * java.lang.reflect.Proxy\
 *
 * 根据传入的目标对象，利用反射机制，返回一个代理对象。然后通过代理对象，调用目标对象方法
 */
public class ProxyFactory {

    // 目标对象
    private Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }

    public Object getProxyInstance(){
        /**
         * ClassLoader loader 指定当前目标对象使用的类加载器，获取加载器的方法固定
         * Class<?>[] interfaces 目标对象实现的接口类型，使用方向方式确认类型
         * InvocationHandler h 事情处理，执行目标对象的方法是，会触发事情处理器方法
         */
        ClassLoader loader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler h = (Object proxy, Method method, Object[] args) -> {
                System.out.println("反射机制调用目标对象的方法");
                Object invoke = method.invoke(target, args);
                System.out.println("JDK代理提交");
                return invoke;
        };
        return Proxy.newProxyInstance(loader, interfaces, h);
    }
}
