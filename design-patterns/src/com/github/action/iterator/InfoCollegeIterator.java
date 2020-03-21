package com.github.action.iterator;

import java.util.Iterator;
import java.util.List;

public class InfoCollegeIterator implements Iterator{

    // 需要知道存放的形式 List
    List<Department> departments;
    // 遍历的位置
    int position = -1;

    public InfoCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.size() - 1){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        position += 1;
        return  departments.get(position);
    }

    @Override
    public void remove() {

    }
}
