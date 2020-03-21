package com.github.action.iterator;

import java.util.Iterator;

public class ComputerCollege implements College {

    Department[] departments = new Department[5];
    // 当前数组的对象个数
    int num = 0;

    @Override
    public String getName() {
        return "计算机学院";
    }

    // 初始化数据
    public ComputerCollege() {
        addDepartment("Java");
        addDepartment("Spring");
        addDepartment("数据结构");
    }

    @Override
    public void addDepartment(String name) {
        Department department = new Department(name);
        departments[num] = department;
        num += 1;
    }

    @Override
    public Iterator iterator() {
        return new ComputerCollegeIterator(departments);
    }
}
