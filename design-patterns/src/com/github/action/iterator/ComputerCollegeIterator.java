package com.github.action.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator{

    // 需要知道存放的形式 Arrays[]
    Department[] departments;
    // 遍历的位置
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || departments[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    @Override
    public void remove() {

    }
}
