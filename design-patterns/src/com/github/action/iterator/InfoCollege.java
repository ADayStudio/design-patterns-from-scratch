package com.github.action.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {

    List<Department> departments = new ArrayList<>();

    @Override
    public String getName() {
        return "信息工程学院";
    }

    public InfoCollege() {
        addDepartment("信息安全");
        addDepartment("网络安全");
        addDepartment("服务器安全");
    }

    @Override
    public void addDepartment(String name) {
        Department department = new Department(name);
        departments.add(department);
    }

    @Override
    public Iterator iterator() {
        return new InfoCollegeIterator(departments);
    }
}
