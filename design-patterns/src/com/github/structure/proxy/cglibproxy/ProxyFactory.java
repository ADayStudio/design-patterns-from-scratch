package com.github.structure.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import java.lang.reflect.Method;

/**
 * MethodInterceptor 方法拦截器
 * cglib是针对类来实现代理的，原理是对指定的目标类生成一个子类，并覆盖其中方法实现增强，但因为采用的是继承，所以不能对final修饰的类进行代理
 */
public class ProxyFactory implements MethodInterceptor {

    Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }

    /**
     * 返回target目标对象的代理对象
     * 调用代理对象的时候，会触发调用intercept()
     * @return
     */
    public Object getProxyInstance(){
        // 1.cglib增强类
        Enhancer enhancer = new Enhancer();
        // 2.设置父类
        enhancer.setSuperclass(target.getClass());
        // 3.设置回调函数
        enhancer.setCallback(this);
        // 4.创建子类对象，即代理对象
        return enhancer.create();
    }

    /**
     * 重写intercept方法，实现对被代理对象(目标对象)方法调用
     * @param o
     * @param method
     * @param objects 方法参数
     * @param methodProxy
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib start");
        Object invoke = method.invoke(target, objects);
        System.out.println("cglib end");
        return invoke;
    }
}
