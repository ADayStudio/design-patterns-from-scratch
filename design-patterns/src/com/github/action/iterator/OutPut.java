package com.github.action.iterator;

import java.util.Iterator;
import java.util.List;

public class OutPut {

    // 学院
    List<College> collegeList;

    public OutPut(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College next = iterator.next();
            System.out.println(next.getName());
            printDepartment(next.iterator());
        }
    }

    /**
     * 通过迭代器进行输出
     * @param iterator
     */
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department next = (Department)iterator.next();
            System.out.println(next.getName());
        }
    }
}
