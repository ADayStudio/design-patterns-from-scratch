package com.github.structure.proxy.staticproxy;


/**
 * 代理对象
 * 静态代理，需要实现目标接口，聚合目标对象
 */
public class TeachDaoProxy implements TeacherDao{

    // 目标对象
    private TeacherDao target;

    public TeachDaoProxy(TeacherDao target){
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("proxy start");
        target.teach();
        System.out.println("proxy end");
    }
}
